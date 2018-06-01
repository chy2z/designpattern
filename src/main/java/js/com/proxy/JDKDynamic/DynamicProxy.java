package js.com.proxy.JDKDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
* @Title: Proxy
* @Description: JDK动态代理
* @author chy
* @date 2018/3/22 15:06
*/
public class DynamicProxy implements InvocationHandler {

    private Object tar;

    /**
     * 绑定委托对象，并返回代理类
     * @param tar
     * @return
     */
    public Object bind(Object tar)
    {
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),
                this);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy , Method method , Object[] args)throws Throwable
    {
        Object result = null;
        System.out.println("Proxy start invoked!");
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar,args);
        System.out.println("Proxy start invoked!");
        //在调用具体函数方法后，执行功能处理
        return result;
    }

}
