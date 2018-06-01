package js.com.adapter.my;


/**
* @Title: Client
* @Description: 适配器模式：适用于某种功能转换
  关键词: 功能转换
  比如默认只能处理串口 rs232，现在要适配处理 usb和485 串口，必须实现 usb和485到rs232的转换
  适配器模式的用意是要改变源的接口，以便于目标接口相容
* @author chy
* @date 2018/5/12 15:22
*/
public class Client {

   public static void main(String[] arg) {
       Adapter adapter = new Adapter();
       adapter.format("rs232");
       adapter.format("rs485");
       adapter.format("usb");
   }

}
