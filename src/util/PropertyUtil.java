package util;

import java.io.*;
import java.util.Date;
import java.util.Properties;

/**
 * Properties配置文件的操作类
 * Created by zg on 2020/3/23.
 */
public class PropertyUtil {
    protected static Properties props;
    static{
        loadProps();
    }

    synchronized static private void loadProps(){
        props = new Properties();
        InputStream inputStream=null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(new File("config/heroconfig.properties")));
            props.load(inputStream);
        } catch (FileNotFoundException e) {
            System.out.println("config.properties文件未找到");
        } catch (IOException e) {
            System.out.println("出现IOException");
        } finally {
            try {
                if(null != inputStream) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("config.properties文件流关闭出现异常");
            }
        }
        System.out.println("加载properties文件内容完成...........");
    }
    private static Properties getProps(){
        if(null == props) {
            loadProps();
        }
        return props;
    }
    public static String getProperty(String key){
        return getProps().getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return getProps().getProperty(key, defaultValue);
    }

    public static void setProperty(String key,String value) {
        try {
            if(null == props) {
                loadProps();
            }
            File file = new File("config/heroconfig.properties");
            FileOutputStream oFile;
            if(!file.exists()){
                oFile  = new FileOutputStream(new File("config/config.properties"));
            }else
                oFile = new FileOutputStream(file);
            props.setProperty(key, value);
            props.store(oFile, new Date().toString());
            oFile.close();
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
