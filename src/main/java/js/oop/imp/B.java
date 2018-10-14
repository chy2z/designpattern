package js.oop.imp;

public interface B {

    /**
     * 默认方法
     */
    public default  void  print() {
        System.out.println("B->" + info());
    }

    /**
     * 声明
     * @return
     */
    public String info();
}
