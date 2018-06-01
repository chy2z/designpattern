package js.com.template_method.my;

/**
* @Title: Client
* @Description: 模版方法：规定是类的行为模式.
  比如： 软件工程规范了软件开发流程，无论你使用java或者net语言开发，软件系统的开发流程都是一样的。
* @author chy
* @date 2018/5/12 15:57
*/
public class Client {

   public  static void main(String[] ars){
       SoftwareEngineering javaSe = new JavaSoftWare();
       SoftwareEngineering netSe = new NetSoftWare();
       javaSe.work();
       netSe.work();
   }

}
