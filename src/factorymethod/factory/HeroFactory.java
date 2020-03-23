package factorymethod.factory;

import factorymethod.base.Hero;
import factorymethod.heros.QinQHero;
import factorymethod.heros.WeiZHero;

/** �߸�կӢ�۹����������û�����ָ�������ز�ͬ��Ӣ�۶���
 * �������������仯��װ��һ���������ࣨFactory���У���Ӱ��Hero��ҵ����
 * Created by zg on 2020/3/23.
 */
public class HeroFactory {
    //���������Ӣ����ţ�����Ӣ�۶���
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
