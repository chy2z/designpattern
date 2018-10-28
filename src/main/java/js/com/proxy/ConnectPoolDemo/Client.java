package js.com.proxy.ConnectPoolDemo;

/**
 * Created by chy on 2018/10/26.
 */
public class Client {

    public static void main(String[] args) {

        Pool pool1=RedisPool.getConnect();
        Pool pool2=RedisPool.getConnect();
        Pool pool3=RedisPool.getConnect();
        Pool pool4=RedisPool.getConnect();
        Pool pool5=RedisPool.getConnect();

        Pool pool6=RedisPool.getConnect();
        Pool pool7=RedisPool.getConnect();

        pool1.connect();
        pool2.connect();
        pool3.connect();
        pool4.connect();
        pool5.connect();

        if(pool6!=null){
            pool6.connect();
        }

        if(pool7!=null){
            pool7.connect();
        }

        pool1.close();
        pool5.close();

        pool6=RedisPool.getConnect();
        pool7=RedisPool.getConnect();

        if(pool6!=null){
            pool6.connect();
        }

        if(pool7!=null){
            pool7.connect();
        }

        pool2.read();
        pool3.read();
        pool4.read();
        pool6.read();
        pool7.read();

    }

}
