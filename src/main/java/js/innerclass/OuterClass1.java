package js.innerclass;


/**
* @Title: OuterClass1
* @Description: 内部类的同名方法
* @author chy
* @date 2018/9/16 21:46
*/
public class OuterClass1 {

    private void outerMethod2(){
        System.out.println("It's outerMethod2 of OuterClass");
    }

    private void outerMethod() {
        System.out.println("It's outerMethod of OuterClass");
    }

    public static void main(String[] args) {
        OuterClass1 t = new OuterClass1();
        OuterClass1.Innerclass in = t.new Innerclass();
        in.innerMethod();
    }

    class Innerclass {
        public void innerMethod() {
            // 内部类成员方法与外部类成员方法同名时，使用this调用外部类的方法
            OuterClass1.this.outerMethod();
            // 自动转换为 outerMethod2 ---> OuterClass1.this.outerMethod2();
            outerMethod2();
            // 内部类没有同名方法时执行外部类的方法
            outerMethod();
        }
        private void outerMethod() {
            System.out.println("It's outerMethod of Innerclass");
        }
    }
}