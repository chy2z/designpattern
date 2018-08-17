package js.experience.lsp.lsp3;

import java.util.Collection;
import java.util.Map;

/**
* @Title: Child
* @Description: 子类
* @author chy
* @date 2018/7/16 16:54
*/
public class Child extends Parent {

    /**
     * 此处方法名称虽然和父类一样，但是参数不一样，不是重写
     * 是重载
     * 重载：不同的参数类型或参数个数，而写多个函数
     * @param map
     * @return
     */
    public Collection doSomething(Map map){
        System.out.println("子类被执行...");
        return map.values();
    }

    public Collection doOtherSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }


    public Child other(Child p) {
        System.out.println("子类被执行...");
        return p;
    }


//    public Parent other(Parent p) {
//        System.out.println("子类被执行...");
//        return p;
//    }
}
