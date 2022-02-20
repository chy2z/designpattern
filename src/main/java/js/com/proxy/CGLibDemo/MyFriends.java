package js.com.proxy.CGLibDemo;


import net.sf.cglib.proxy.Enhancer;

import java.util.Arrays;
import java.util.List;

public class MyFriends {

    private List<String> friends = Arrays.asList("代理商1", "代理商2");

    private Agenter agenterLazy = null;

    private Agenter agenterDispatch = null;

    private String name="chy2z";

    public MyFriends() {

    }

    /**
     * 构造函数
     * @param name
     */
    public MyFriends(String name) {
        this.name=name;
        System.out.println("我的名字是" + name);
        this.agenterLazy=createAgenterLazyLoader();
        this.agenterDispatch=createAgenterDispatcher();
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    public String getFriend(int index) {
        return friends.get(index);
    }

    /**
     * 获取所有元素
     * @return
     */
    public List<String> getAllFriend() {
        return friends;
    }

    /**
     * 说话
     * @param param
     * @return
     */
    public String toSay(String param) {
        return "我想说:" + param;
    }

    /**
     * 打招呼
     * @return
     */
    public String sayHello() {
        return "大家好！";
    }

    /**
     * final 方法不能使用代理
     * @return
     */
    public final String finalPrint() {
        return "我是" + name + "!";
    }

    /**
     * 懒加载代理商
     * @return
     */
    public  Agenter createAgenterLazyLoader() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Agenter.class);
        enhancer.setCallback(new AgenterLazyLoader());
        return (Agenter) enhancer.create();
    }

    /**
     * 正常加载代理商
     * @return
     */
    public Agenter createAgenterDispatcher() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Agenter.class);
        enhancer.setCallback(new AgenterDispatcher());
        return (Agenter) enhancer.create();
    }

    public Agenter getAgenterLazy() {
        return agenterLazy;
    }

    public void setAgenterLazy(Agenter agenterLazy) {
        this.agenterLazy = agenterLazy;
    }

    public Agenter getAgenterDispatch() {
        return agenterDispatch;
    }

    public void setAgenterDispatch(Agenter agenterDispatch) {
        this.agenterDispatch = agenterDispatch;
    }
}