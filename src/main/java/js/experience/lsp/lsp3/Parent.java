package js.experience.lsp.lsp3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
* @Title: Parent
* @Description: 父类
* @author chy
* @date 2018/7/16 16:54
*/
public class Parent {

    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行...");
        return map.values();
    }


    public Collection doOtherSomething(Map map) {
        System.out.println("父类被执行...");
        return map.values();
    }

    public Parent other(Child p) {
        System.out.println("父类被执行...");
        return p;
    }

}
