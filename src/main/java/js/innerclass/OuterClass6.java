package js.innerclass;


public class OuterClass6 {

    public void method() {
        final Integer number = 123;
        System.out.println(number);

        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println(number);
            }
        };

        myInterface.doSomething();

        System.out.println(number);
    }

    public static void main(String[] args) {
        OuterClass6 outerClass6=new OuterClass6();
        outerClass6.method();
    }
}

interface MyInterface {
    void doSomething();
}
