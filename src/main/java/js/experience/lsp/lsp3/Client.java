package js.experience.lsp.lsp3;

import java.util.HashMap;

/**
 * Created by chy on 2018/7/16.
 */
public class Client {

    /**
     * 覆盖或实现父类的方法时输入参数可以被放大
     *
     * @param args
     */
    public static void main(String[] args) {

        test1();

        System.out.println("===========================");

        test2();

        System.out.println("===========================");

        test3();
    }

    /**
     * 发现子类调用doSomething和父类调用doSomething结果一样。
     * 满足里氏替换原则
     * 出现父类就可以出现子类，调用结果一样
     */
    public static void test1() {
        HashMap map = new HashMap();
        Parent p = new Parent();
        p.doSomething(map);

        Child c = new Child();
        c.doSomething(map);

        p = c;
        p.doSomething(new HashMap());
    }

    /**
     * 发现子类调用doOtherSomething和父类调用doOtherSomething结果不一样。
     * 不能满足里氏替换原则
     * 出现父类就可以出现子类，调用结果不一样
     */
    public static void test2() {
        HashMap map = new HashMap();
        Parent p = new Parent();
        p.doOtherSomething(map);

        Child c = new Child();
        c.doOtherSomething(map);

        p = c;
        p.doOtherSomething(map);
    }

    public static void test3() {
        Parent p = new Parent();
        Child c = new Child();
        p.other(c);
        c.other(c);
    }

}