package abstractfactory.base;

/**
 * 这里使用接口来抽象共有方法。
 * 将Hero类中的业务变化的部分隔离出去了，专心的只做自己的业务。
 * Created by zg on 2020/3/23.
 */
public interface Hero {
    String getName();
}
