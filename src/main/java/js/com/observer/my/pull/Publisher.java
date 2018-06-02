package js.com.observer.my.pull;

/**
* @Title: Publisher
* @Description: 发布者
* @author chy
* @date 2018/6/1 17:31
*/
public class Publisher extends Publish {

    /**
     * 发布信息
     */
    public String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
