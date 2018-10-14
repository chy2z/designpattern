package js.innerclass;

/**
* @Title: OuterClass3
* @Description: 内部类静态方法中实例化
*                  1 不能在static方法中直接new内部类
*                  2 Static方法中new内部类，必须内部类声明为Static
* @author chy
* @date 2018/9/16 22:09
*/
public class OuterClass3 {

    private static void outerMethod() {
        System.out.println("It's Method of OuterClass");
    }

    // Static方法中new内部类
    public static void main(String[] args) {
        Innerclass in = new Innerclass();
        in.innerMethod();
    }

    //把内部类声明为static
    static class Innerclass {
        public void innerMethod() {
            OuterClass3.outerMethod();
            System.out.println("It's Method of innerMethod");

        }
    }

}
