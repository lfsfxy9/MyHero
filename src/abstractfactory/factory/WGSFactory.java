package abstractfactory.factory;

import abstractfactory.base.Hourse;
import abstractfactory.factory.HeroAbstractFactory;
import factorymethod.base.Hero;

/**
 *  定义 瓦岗寨工厂，用来获取瓦岗寨英雄和英雄有关的战马、兵器等资源。
 * Created by zg on 2020/3/28 .
 */
public class WGSFactory implements HeroAbstractFactory {
    @Override
    public Hero getHero() {
        return null;
    }

    @Override
    public Hourse getHerosHourse() {
        return null;
    }
}
