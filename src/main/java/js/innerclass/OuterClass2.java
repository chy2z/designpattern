package js.innerclass;

/**
* @Title: OuterClass2
* @Description: 内部类访问外部类的变量必须声明为final
*               jdk 1.8 以后不需要声明为final
* @author chy
* @date 2018/9/16 22:07
*/
public class OuterClass2 {

    int num1 = 10;// 成员变量

    private void outerMethod() {
        // 方法内的局部变量
        int num2 = 20;

        class Innerclass1 {
            public void innerMethod() {
                // 方法中内部类的方法，可以正常访问外部类的成员变量
                // 自动将 num1 --> OuterClass2.this.num1
                System.out.println(num1);
                // JDK1.8以前，方法中内部类的方法，不能直接访问外部类的方法的局部变量，必须声明为final
                // 自动将 int num2 = 20 ---> final int num2 = 20;
                System.out.println(num2);
            }
        }

        Innerclass1 innerclass1= new Innerclass1();
        innerclass1.innerMethod();
    }

    public static void main(String[] args) {
        OuterClass2 class2=new OuterClass2();
        class2.outerMethod();
    }
}
