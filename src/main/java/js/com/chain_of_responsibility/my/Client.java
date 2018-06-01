package js.com.chain_of_responsibility.my;

/**
* @Title: Client
* @Description: 责任链模式：职责的传递
  关键词：传递
  比如: 垃圾分类处理 塑料垃圾 玻璃垃圾 金属垃圾
* @author chy
* @date 2018/5/14 10:06
*/
public class Client {

   public static  void main(String[] arg){
       PlasticGarbageDisposal plasticGarbageDisposal=new PlasticGarbageDisposal();
       GlassGarbageDisposal glassGarbageDisposal=new GlassGarbageDisposal();
       MetalGarbageDisposal metalGarbageDisposal=new MetalGarbageDisposal();

       //处理链
       GarbageDisposal garbageDisposal=plasticGarbageDisposal;
       plasticGarbageDisposal.setNextGarbageDisposal(glassGarbageDisposal);
       glassGarbageDisposal.setNextGarbageDisposal(metalGarbageDisposal);

       //垃圾
       String[] garbages=new String[]{"金属刀","塑料手套","玻璃瓶","塑料袋"};

       //处理
       for(String g : garbages) {
           garbageDisposal.doGarbageDisposal(g);
       }
   }

}
