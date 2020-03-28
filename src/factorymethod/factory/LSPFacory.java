package factorymethod.factory;

import factorymethod.base.Hero;
import factorymethod.heros.WeiZHero;

/**
 *  定义 梁山泊108将的工厂类（工厂方法），仅提供单个类型的对象创建。
 * Created by zg on 2020/3/28 .
 */
public class LSPFacory implements  HeroFactoryMethod {
    @Override
    public String getHeroName(Hero hero) {
        return hero.getName();
    }
}
