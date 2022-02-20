package js.com.proxy.CGLibDemo;

import net.sf.cglib.proxy.LazyLoader;

import java.util.Date;

/**
* @Title: AgenterLazyLoader
* @Description: 懒加载
* @author chy
* @date 2018/7/14 11:05
*/
public class AgenterLazyLoader implements LazyLoader {

    public Object loadObject() throws Exception {
        System.out.println("懒加载开始.......");
        Agenter agenter=new Agenter();
        agenter.setAppointmentDate(new Date());
        System.out.println("懒加载结束.......");
        return agenter;
    }

}
