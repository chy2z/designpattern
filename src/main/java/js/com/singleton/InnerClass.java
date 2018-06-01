package js.com.singleton;

/**
* @Title: InnerClass
* @Description: 单例模式 内部静态类
* @author chy
* @date 2018/5/8 16:06
*/
public class InnerClass {

    private InnerClass(){

    }

    /**
     * 私有静态类
     * 线程安全
     */
    private static class MySelf {
        private  static final InnerClass instance = new InnerClass();
    }


    public static InnerClass getInstance() {
        return MySelf.instance;
    }
}
