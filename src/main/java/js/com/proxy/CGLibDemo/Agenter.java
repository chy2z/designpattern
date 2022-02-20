package js.com.proxy.CGLibDemo;

import java.util.Date;

/**
* @Title: Agenter
* @Description: 代理商
* @author chy
* @date 2018/7/14 11:16
*/
public class Agenter {

    private Date appointmentDate;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void print(){
        System.out.println(appointmentDate.toLocaleString());
    }
}
