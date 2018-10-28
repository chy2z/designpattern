package js.com.proxy.ConnectPoolDemo;

/**
 * Created by chy on 2018/10/26.
 */
public class BasePool implements Pool {

    private String name;

    private boolean connectStatus=false;

    public BasePool(String name){
        this.name=name;
    }

    @Override
    public void connect() {
        System.out.println(" connect "+this.name+"..... ");
        connectStatus=true;
    }

    @Override
    public void close() {
        System.out.println(" close "+this.name+"..... ");
        connectStatus=false;
    }

    @Override
    public void read() {
        if(connectStatus) {
            System.out.println(" read "+this.name+"..... ");
        }
        else{
            System.out.println(" read error "+this.name+"..... ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
