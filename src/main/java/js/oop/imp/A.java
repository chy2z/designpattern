package js.oop.imp;


public interface A {

    /**
     * 默认方法
     */
    public default  void  print() {
        System.out.println("A->" + info());
    }

    /**
     * 声明
     * @return
     */
    public String info();

}
