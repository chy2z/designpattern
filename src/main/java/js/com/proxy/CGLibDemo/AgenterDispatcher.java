package js.com.proxy.CGLibDemo;

import net.sf.cglib.proxy.Dispatcher;

import java.util.Date;

/**
* @Title: AgenterDispatcher
* @Description: 正常加载
* @author chy
* @date 2018/7/14 11:10
*/
public class AgenterDispatcher implements Dispatcher {

    public Object loadObject() throws Exception {
        System.out.println("加载开始.......");
        Agenter agenter=new Agenter();
        agenter.setAppointmentDate(new Date());
        System.out.println("加载结束.......");
        return agenter;
    }

}
