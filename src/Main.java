import abstractfactory.factory.HeroAbstractFactory;
import abstractfactory.factory.WGSFactory;
import factorymethod.base.Hero;
import factorymethod.factory.HeroFactoryMethod;
import factorymethod.heros.QinQHero;

import java.util.Scanner;

public class Main {
    //定义全局Scanner变量
    static Scanner scanner = new Scanner(System.in);

    /**
     * 提供静态方法，用于获取控制台输入的数据并返回给方法调用方
     * @return
     */
    private static String getInputIndexStr(){
        //设置控制台输入
        System.out.println("想要和瓦岗寨第几把交椅的英雄对战，请输入数字！");
        String inputStr = scanner.next();
        return inputStr;
    }

    //抽象工厂
    /*public static void main(String[] args) {
        PropertyUtil.setProperty("1", "test");
        System.out.println(PropertyUtil.getProperty("1"));



    }*/

    //抽象工厂
    /*public static void main(String[] args) {
        HeroAbstractFactory factory = new WGSFactory();
        Hero hero = factory.getHero();
        System.out.println(hero.getName());
        scanner.close();
    }*/

    //工厂方法
    public static void main(String[] args) {
        HeroFactoryMethod factory = new factorymethod.factory.WGSFactory();
        Hero hero = new QinQHero();
        System.out.println(factory.getHeroName(hero));
        scanner.close();
    }

    //简单工厂
    /*public static void main(String[] args) {
        String index = getInputIndexStr();
        Hero hero = new Hero();
        hero.getHero(index);
        scenner.close();
    }*/
}
