package factorymethod.factory;

import factorymethod.base.Hero;

/**
 * 定义英雄的工厂方法，用来
 * Created by zg on 2020/3/23.
 */
public interface  HeroFactoryMethod {
    String getHeroName(Hero hero);
}
