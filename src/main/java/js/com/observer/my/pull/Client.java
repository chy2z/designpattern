package js.com.observer.my.pull;

/**
* @Title: Client
* @Description:  观察者模式  拉取模式
  主题对象在通知观察者的时候，只传递少量信息。如果观察者需要更具体的信息，
  由观察者主动到主题对象中获取，相当于是观察者从主题对象中拉数据
  关键词: 包装
  打个比方: 消息发布和订阅
* @author chy
* @date 2018/6/1 16:16
*/
public class Client {

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {

        Publisher publisher = new Publisher();

        publisher.setMsg("6-2的报纸");

        Subscriber subscriberA=new Subscriber(publisher,"观察A");

        Subscriber subscriberB=new Subscriber(publisher,"观察B");

        publisher.notifySubs();
    }

}
