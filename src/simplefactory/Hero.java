package simplefactory;

import java.util.Scanner;

/**
 * ���ݿͻ������������ѡ���߸�կ��Ӧ���ε�Ӣ�۳�����
 *  �򵥹���ģʽ������ķ�����װ�����У����ݲ�ͬ����������ҵ������ҵ��仯��װ�������С�
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
