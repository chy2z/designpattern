package js.oop.imp;


public class D implements A,B {

    @Override
    public void print() {
        System.out.println("D->" + info());
    }

    @Override
    public String info() {
        return "my name is D";
    }
}
