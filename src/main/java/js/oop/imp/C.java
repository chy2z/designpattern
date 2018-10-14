package js.oop.imp;


/**
* @Title: C
* @Description: 接口多继承
* @author chy
* @date 2018/8/22 9:06
*/
public interface C extends A,B {

    @Override
    default void print() {
        System.out.println("C->" + info());
    }
}
