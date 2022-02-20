package js.com.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
* @Title: Leader
* @Description: 委托执行人
* @author chy
* @date 2018/8/6 9:00
*/
public class Leader implements  ITarget {

    /**
     * 干活的人
     */
    private Map<String,ITarget> targets = new HashMap<String,ITarget>();

    public Leader() {
        targets.put("加密",new TargetA());
        targets.put("登录",new TargetB());
    }

    /**
     * 分配任务
     * @param command
     */
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
