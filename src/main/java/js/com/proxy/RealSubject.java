package js.com.proxy;

/**
* @Title: RealSubject
* @Description: 代理目标
* @author chy
* @date 2018/5/12 16:23
*/
public class RealSubject implements Subject {
    public void request(){
        System.out.println("Real subject invoked!");
    }
}
