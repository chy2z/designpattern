package js.com.proxy;

/**
* @Title: Client
* @Description:  静态代理
 代理模式： 为其他对象提供一种代理以控制对这个对象的访问。
 关键词：控制
 打个比方，好比犯人被囚禁起来，犯人在做什么事之前和之后，都在监狱警察的监控中。
 犯人做事的过程，监狱警察并不干预。
* @author chy
* @date 2018/5/12 16:44
*/
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
