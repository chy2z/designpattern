package js.com.observer.my.pull;

/**
* @Title: Subscriber
* @Description: 订阅 (观察者)
* @author chy
* @date 2018/6/2 13:57
*/
public class Subscriber implements Subscribe {

    private String name;

    private Publisher publish;

    public Subscriber(){

    }

    public Subscriber(Publisher publish,String name) {
        this.publish = publish;
        this.name = name;
        this.publish.attach(this);
    }

    /**
     * 拉取信息
     */
    public void pull() {
       System.out.println("拉取信息:"+this.publish.getMsg());
    }
}