package js.com.command;

/**
 * 命令模式
 * 命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        //接收者
        Receiver r = new Receiver();
        //命令
        Command c = new ConcreteCommand(r);
        //请求者
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
