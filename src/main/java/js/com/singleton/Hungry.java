package js.com.singleton;

/**
 * 单例模式 饿汉式
 *
 */
public class Hungry {

    private Hungry() {

    }

    /**
     * 已经自行实例化
     * 线程安全
     */
    private static final Hungry singleton = new Hungry();

    /**
     * 静态工厂方法
     * @return
     */
    public static Hungry getInstance() {
        return singleton;
    }
}
