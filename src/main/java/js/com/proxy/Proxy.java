package js.com.proxy;

/**
* @Title: Proxy
* @Description:代理
* @author chy
* @date 2018/5/12 16:23
*/
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request(){
        System.out.println("Proxy start invoked!");
        subject.request();
        System.out.println("Proxy end invoked!");
    }
}
