package js.com.strategy.strategyWithFactory;

public class Context {
    private Strategy strategy;

    public void contextInterface(int type){
        switch (type){
            case 1:
                strategy = new StrategyA();
                strategy.algorithm();
                break;
            case 2:
                strategy = new StrategyB();
                strategy.algorithm();
                break;
            default:
                System.out.println("输入有误");;

        }
    }
}
