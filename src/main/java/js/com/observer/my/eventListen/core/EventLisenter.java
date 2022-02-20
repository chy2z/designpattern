package js.com.observer.my.eventListen.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
* @Title: EventLisenter
* @Description: 事件的注册和监听
* @author chy
* @date 2018/8/6 10:12
*/
public class EventLisenter {

    /**
     * Map注册器
     */
    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    /**
     * 注册事件
     * @param eventType
     * @param target
     * @param callback
     */
    public void addLisenter(Enum eventType,Object target,Method callback){
        // 用反射调用这个方法
        events.put(eventType,new Event(target,callback));
    }

    /**
     * 触发注册事件
     * @param call
     */
    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return ;}
        triggerEvent(this.events.get(call).setTrigger(call.toString()));
    }

    /**
     * 执行事件
     * @param e
     */
    private void triggerEvent(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
