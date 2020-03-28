package abstractfactory.factory;

import abstractfactory.base.Hourse;
import factorymethod.base.Hero;

/**
 * 定义抽象工厂，同样是将相对固定的业务类的创建过程进行关联（封装），因此带来了耦合性的隐患。
 * 相比工厂方法而言，
 * Created by zg on 2020/3/23.
 */
public interface  HeroAbstractFactory {

    //根据输入的英雄序号，从配置文件中匹配到英雄类的类路径，通过反射来拿到这个具体的类。
    /*public static Hero getHero(String index) throws ClassNotFoundException {
        String classPath = PropertyUtil.getProperty(index);
        Hero hero = (Hero)Class.forName(classPath);
        Class<T> claz = Class.forName("");
        return hero;
    }*/

    //获得对应的英雄
    Hero getHero();
    //获得战马
    Hourse getHerosHourse();
}
