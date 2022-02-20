package js.com.observer.my.pull;

import java.util.ArrayList;
import java.util.List;

/**
* @Title: Publish
* @Description:发布抽象类
* @author chy
* @date 2018/6/1 17:07
*/
public abstract class Publish {

    /**
     * 观察者
     */
    private List<Subscribe> subscribe = new ArrayList<Subscribe>();

    public  void attach(Subscribe o){
        subscribe.add(o);
    }

    public void  detach(Subscribe o){
        subscribe.remove(o);
    }

    /**
     * 通知消费
     */
    public void notifySubs(){
        for (int i=0; i<subscribe.size(); i++){
            subscribe.get(i).pull();
        }
    }

}