package factorymethod.factory;

import factorymethod.base.Hero;
import factorymethod.heros.QinQHero;

/**
 *  定义瓦岗山工厂（工厂方法）
 * Created by zg on 2020/3/28 .
 */
public class WGSFactory implements  HeroFactoryMethod {
    @Override
    public String getHeroName(Hero hero) {
        return hero.getName();
    }
}
