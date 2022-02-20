package js.com.proxy.CGLibDemo;


public class AgrenterClient {

    public static void main(String[] args) {

        Thread th=new Thread(new Runnable() {
            public void run() {
                MyFriends my = new MyFriends("chy");
                while (true) {
                    // LazyLoader:只有第一次
                    // Dispatcher:每次都会进loadObject的方法
                    System.out.println("======== ========");
                    my.getAgenterLazy().print();
                    System.out.println();
                    System.out.println("================");
                    my.getAgenterDispatch().print();
                    System.out.println();
                    System.out.println("======== ========");
                    my.getAgenterLazy().print();
                    System.out.println();
                    System.out.println("======== ========");
                    my.getAgenterDispatch().print();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        th.start();

        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
