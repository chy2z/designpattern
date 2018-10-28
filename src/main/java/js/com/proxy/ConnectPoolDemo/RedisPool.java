package js.com.proxy.ConnectPoolDemo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RedisPool {

    private static ConcurrentLinkedQueue<Pool> concurrentLinkedQueue=new ConcurrentLinkedQueue<>();

    private static int MIN_POOL_NUM=3;

    private static int MAX_POOL_NUM=5;

    private static AtomicInteger ACTIVE_POOL_NUM= new AtomicInteger(0);

    static {
        for (int i = 0; i < MIN_POOL_NUM; i++) {
            concurrentLinkedQueue.add(createPool());
        }
    }

    public static synchronized Pool getConnect() {
        if (concurrentLinkedQueue.size() > 0) {
            return concurrentLinkedQueue.poll();
        } else {
            if (ACTIVE_POOL_NUM.get() < MAX_POOL_NUM) {
                return createPool();
            } else {
                System.out.println(" please wait ......");
                return null;
            }
        }
    }

    /**
     * 创建连接池
     * @return
     */
    private static Pool createPool() {

        final BasePool basePool= new BasePool(String.valueOf(ACTIVE_POOL_NUM.get()));

        //动态代理，代理 pool 的关闭方法
        Pool pool = (Pool) Proxy.newProxyInstance(BasePool.class.getClassLoader(),
                basePool.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //关闭后放回连接池中
                        if (method.getName().equals("close")) {
                            System.out.println(" back in the pool "+basePool.getName()+"...... ");
                            concurrentLinkedQueue.add((Pool) proxy);
                        }
                        else{
                            method.invoke(basePool,args);
                        }

                        return null;
                    }
                });

        ACTIVE_POOL_NUM.getAndIncrement();

        return pool;
    }
}
