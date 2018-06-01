package js.com.adapter.my;

/** 
* @Title: Adapter
* @Description: 串口适配器
* @author chy
* @date 2018/5/12 15:22 
*/
public class Adapter implements DefaultRs232 {

    private DefaultRs232 adapterTarget;

    public void format(String type) {
        if(type.equals("usb")){
            adapterTarget=new AdapterUsb();
            adapterTarget.format(type);
        }
        else if(type.equals("rs485")){
            adapterTarget=new AdapterRs485();
            adapterTarget.format(type);
        }
        else if(type.equals("rs232")){
            System.out.println("rs232 ");
        }
        else{
            System.out.println("error ");
        }
    }
}
