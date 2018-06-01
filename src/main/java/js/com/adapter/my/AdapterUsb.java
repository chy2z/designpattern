package js.com.adapter.my;

/**
* @Title: AdapterUsb
* @Description: usb 转 rs-232
* @author chy
* @date 2018/5/12 16:13
*/
public class AdapterUsb implements DefaultRs232 {


    public void format(String type) {
        System.out.println("usb 转 rs-232 ");
    }
}
