package js.innerclass;

/**
* @Title: OuterClass4
* @Description: 内部类声明
* @author chy
* @date 2018/9/16 22:17
*/
public class OuterClass4 {

    private void outerMethod() {
        System.out.println("It's Method of OuterClass");
    }

    public static void main(String[] args) {
        // 使用x.new 内部类 的方式
        OuterClass4.Innerclass in = new OuterClass4().new Innerclass();
        in.innerMethod();

        // 外部实例.new 内部类
        OuterClass4 outerClass4=new OuterClass4();
        Innerclass innerclass=outerClass4.new Innerclass();
        innerclass.innerMethod();
    }

    class Innerclass {
        public void innerMethod() {
            System.out.println("It's Method of innerMethod");
        }
    }
}
