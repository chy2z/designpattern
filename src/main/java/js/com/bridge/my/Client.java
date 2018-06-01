package js.com.bridge.my;

/**
* @Title: Client
* @Description: 桥接模式：桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化。
                桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量。
  关键词：实现类从继承关系改为关联关系，减少了系统中类的数量
  比如：球 分为 篮球和足球  然后又分为 红色 蓝色 黑色 ，如果采用继承关系的话，在增加个排球，又得增加4个类。排球，红排球，蓝排球，黑排球。
  如果采用关联关系，只需要增加排球1个类即可。
* @author chy
* @date 2018/5/14 15:45
*/
public class Client {

    public static void main(String[] arg){
        Ball footBall = new Football();
        Ball basketball = new Basketball();

        //红色的足球
        footBall.setColor(new RedColor());

        //蓝色的篮球
        basketball.setColor(new BlueColor());

        /** 扩展

         扩展排球，只需要继承Ball实现排球类，增加1个类即可。
         排球  pball=new 排球();

         想要红色的排球
         pball.setColor(new RedColor());

         想要蓝色的排球
         pball.setColor(new BlueColor());

         就这么简单

         **/
    }

}
