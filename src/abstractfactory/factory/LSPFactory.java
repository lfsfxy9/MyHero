package abstractfactory.factory;

import abstractfactory.base.Hourse;
import factorymethod.base.Hero;

/**
 * 定义 梁山泊108 工厂，管理梁山泊108把交椅（英雄）以及有关战马、武器等
 * Created by zg on 2020/3/28 .
 */
public class LSPFactory implements  HeroAbstractFactory{
    @Override
    public Hero getHero() {
        return null;
    }

    @Override
    public Hourse getHerosHourse() {
        return null;
    }
}
