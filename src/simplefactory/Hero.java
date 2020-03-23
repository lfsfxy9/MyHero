package simplefactory;

import java.util.Scanner;

/**
 * 根据客户输入的数字来选派瓦岗寨对应交椅的英雄出征。
 *  简单工厂模式，在类的方法封装过程中，根据不同的条件进行业务处理，将业务变化封装到了类中。
 * Created by zg on 2020/3/23.
 */
public class Hero {

    public void getHero(String heroIndex){

        String result = "";
        switch(heroIndex){
            case "1":
                result="Wei Zheng";
                break;
            case "2":
                result = "Qin Qiong";
                break;
            default:
                result = "Null";
        }
        System.out.println("Hero is " + result);

    }

}
