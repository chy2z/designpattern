package js.com.proxy.CGLibDemo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
* @Title: MyFriendProxyOne
* @Description: 代理1
* @author chy
* @date 2018/7/14 10:06
*/
public class MyFriendProxyOne implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理1");
        return methodProxy.invokeSuper(o, objects);
    }
}