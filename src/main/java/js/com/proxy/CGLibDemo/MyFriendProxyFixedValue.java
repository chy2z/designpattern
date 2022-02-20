package js.com.proxy.CGLibDemo;

import net.sf.cglib.proxy.FixedValue;

/**
 * 固定参数值代理
 */
public class MyFriendProxyFixedValue implements FixedValue {

    public Object loadObject() throws Exception {
        System.out.println("固定值代理!");
        return "没回家";
    }

}
