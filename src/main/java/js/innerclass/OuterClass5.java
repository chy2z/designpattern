package js.innerclass;

/**
 * Created by chy on 2018/9/16.
 */
public class OuterClass5 {

    public static void main(String[] args) {

        // Person的对象
        Person p=new Person() {
            // todo 方法不能调用
            public void say() {
                System.out.println("say");
            }

            @Override
            public void speak() {
                System.out.println("speak");
            }
        };
        // Person类看不到say方法
        // p.say();
        p.speak();

        // 匿名内部类中隐含一个匿名对象
        new Person(){
            // todo 方法能调用
            public void say() {
                System.out.println("say");
            }

            @Override
            public void speak() {
                System.out.println("speak");
            }
        }.say();
    }

}


interface Person {
    public void speak();
}


