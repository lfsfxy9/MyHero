package factorymethod.factory;

import factorymethod.base.Hero;
import factorymethod.heros.QinQHero;
import factorymethod.heros.WeiZHero;

/** 瓦岗寨英雄工厂，根据用户输入指令来返回不同的英雄对象。
 * 工厂方法：将变化封装到一个第三方类（Factory）中，不影响Hero的业务处理。
 * Created by zg on 2020/3/23.
 */
public class HeroFactory {
    //根据输入的英雄序号，返回英雄对象。
    public static Hero getHero(String index){
        Hero hero = null;
        switch (index){
            case "1":
                hero = new WeiZHero();
                break;
            case "2":
                hero = new QinQHero();
                break;
            default:
                System.out.println("Hero is Null!!!");
        }
        return hero;
    }
}
