package js.com.factory.simple_factory;

/**
* @Title: Factory
* @Description: 简单工厂方法
* @author chy
* @date 2018/5/9 15:45
*/
public class Factory {

    public static IProduct getProduct(int type){
        if(type == 1){
            return new ProductA();
        }else if(type == 2){
            return new ProductB();
        }else{
            System.out.println("Sorry we don't product it");
            return null;
        }
    }
}
