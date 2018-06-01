package js.com.singleton;

/**
* @Title: DuplicationCheck
* @Description: 单例模式 双重检测
* @author chy
* @date 2018/5/8 16:08
*/
public class DuplicationCheck {

    private DuplicationCheck(){

    }

    /**
     * volatile：保证内存可见性和防止代码重排
     */
    private static volatile DuplicationCheck instance;

    /**
     *  线程安全
     *  volatile：保证 new DuplicationCheck()时不会代码重排
     *  memory = allocate();  // 1：分配对象的内存空间
     *  ctorInstance(memory); // 2：初始化对象
     *  instance = memory;    // 3：设置instance指向刚分配的内存地址
     *  如果2和3重新排序会发生 instance！=null 但是对象没初始化完毕的情况
     * @return
     */
    public static DuplicationCheck getInstance() {
        if (instance == null) {
            synchronized (DuplicationCheck.class) {
                if (instance == null) {
                    instance = new DuplicationCheck();
                }
            }
        }

        return instance;
    }

}
