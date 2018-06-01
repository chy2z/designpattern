package js.com.singleton;

/**
 * 单例模式 懒汉式
 *
 */
public class Lazy {

    private Lazy() {

    }

    private static Lazy singleton=null;

    /**
     * 静态工厂方法
     * synchronized 枷锁线程安全
     * @return
     */
    public synchronized  static Lazy getInstance() {
        if (singleton == null) {
            singleton = new Lazy();
        }
        return singleton;
    }
}
