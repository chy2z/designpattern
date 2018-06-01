package js.com.singleton;

/**
* @Title: Client
* @Description: 单例模式
* @author chy
* @date 2018/5/9 11:47
*/
public class Client {

    public static void main(String[] ary){
        // 饿汉模式
        Hungry hungry = Hungry.getInstance();

        // 懒汉模式
        Lazy lazy = Lazy.getInstance();

        // 静态内部类模式
        InnerClass innerClass=InnerClass.getInstance();

        // 双重检测模式
        DuplicationCheck duplicationCheck=DuplicationCheck.getInstance();
    }
}
