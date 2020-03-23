package abstractfactory.factory;

import abstractfactory.base.Hero;
import abstractfactory.util.PropertyUtil;
import  java.lang.reflect.*;
/** 瓦岗寨英雄工厂，根据用户输入指令来返回不同的英雄对象。
 * 工厂方法：将变化封装到一个第三方类（Factory）中，不影响Hero的业务处理。
 * Created by zg on 2020/3/23.
 */
public class HeroFactory {

    //根据输入的英雄序号，从配置文件中匹配到英雄类的类路径，通过反射来拿到这个具体的类。
    public static Hero getHero(String index) throws ClassNotFoundException {
        String classPath = PropertyUtil.getProperty(index);
        Hero hero = (Hero)Class.forName(classPath);
        Class<T> claz = Class.forName("");
        return hero;
    }
}
