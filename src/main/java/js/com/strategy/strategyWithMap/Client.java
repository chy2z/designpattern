package js.com.strategy.strategyWithMap;

/**
 * 策略模式与Map集成
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Context.getContext("StrategyA");
        Context.getContext("StrategyB");
    }
}
