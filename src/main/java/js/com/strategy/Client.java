package js.com.strategy;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        Context c1 = new Context(new StrategyA());
        c1.contextInterface();

        Context c2 = new Context(new StrategyB());
        c2.contextInterface();
    }
}
