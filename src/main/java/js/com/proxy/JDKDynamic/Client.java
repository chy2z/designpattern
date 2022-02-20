package js.com.proxy.JDKDynamic;


import js.com.proxy.RealSubject;
import js.com.proxy.Subject;


/**
* @Title: Client
* @Description:JDK动态代理
  JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理
* @author chy
* @date 2018/3/22 15:07
*/
public class Client {
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        Subject subject = (Subject) proxy.bind(new RealSubject());
        subject.request();
    }
}
