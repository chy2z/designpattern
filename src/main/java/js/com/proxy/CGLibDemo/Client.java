package js.com.proxy.CGLibDemo;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

/**
* @Title: Client
* @Description:JDK动态代理
 * cglib是针对类来实现代理的
 * CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，
 * 并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑
 *
 *
 * CGLib创建的动态代理对象性能比JDK创建的动态代理对象的性能高不少，
 * 但是CGLib在创建代理对象时所花费的时间却比JDK多得多，所以对于单例的对象，
 * 因为无需频繁创建对象，用CGLib合适，反之，使用JDK方式要更为合适一些。
 * 同时，由于CGLib由于是采用动态创建子类的方法，对于final方法，无法进行代理。
* @author chy
* @date 2018/3/22 15:07
*/
public class Client {

    public static void main(String[] args) {
        MyFriendProxyOne dbQueryProxy = new MyFriendProxyOne();
        MyFriendProxyTwo dbQueryProxy2 = new MyFriendProxyTwo();
        MyFriendProxyThree dbQueryProxy3 = new MyFriendProxyThree();
        //不处理
        Callback noopCb = NoOp.INSTANCE;
        MyFriendProxyFixedValue dbQueryProxyFixedValue=new MyFriendProxyFixedValue();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyFriends.class);

        //对于代理类上所有方法的调用，多个回调
        enhancer.setCallbacks(new Callback[]{noopCb,dbQueryProxy, dbQueryProxy2, dbQueryProxy3,dbQueryProxyFixedValue});

        //CallbackFilter来决定是使用哪个回调
        enhancer.setCallbackFilter(new CallbackFilter() {
            public int accept(Method method) {
                if (method.getName().equals("getElement")) {
                    return 1;
                } else if (method.getName().equals("getAllElements")) {
                    return 2;
                } else if (method.getName().equals("sayHello")) {
                    return 3;
                }
                else if (method.getName().equals("toSay")) {
                    return 4;
                }
                else {
                    //其他方法不代理
                    return 0;
                }
            }
        });

        //无餐构造函数创建
        //MyFriends my = (MyFriends) enhancer.create();

        //有参构造函数创建
        MyFriends my= (MyFriends) enhancer.create(new Class[]{String.class},new Object[]{"黑暗行动"});

        System.out.println("========使用代理1 ========");
        System.out.println(my.getFriend(0));
        System.out.println();

        System.out.println("========使用代理2 ========");
        System.out.println(my.getAllFriend());
        System.out.println();

        System.out.println("========使用代理3========");
        System.out.println(my.sayHello());

        System.out.println();
        System.out.println("========使用固定参数值代理========");
        System.out.println(my.toSay("回家啦"));

        System.out.println();
        System.out.println("========不能使用代理========");
        System.out.println(my.finalPrint());
    }

}
