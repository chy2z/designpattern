package js.com.strategy.strategyWithMap;

import java.util.HashMap;
import java.util.Map;


public class Context {

    private static Map<String,Strategy> strategyList=new HashMap<>();

    static {
        strategyList.put("StrategyA",new StrategyA());
        strategyList.put("StrategyB",new StrategyB());
    }

    public static void getContext(String type){
        if(!strategyList.isEmpty()) {
            Strategy strategy = strategyList.get(type);
            strategy.algorithm();
        }
        else{
            System.out.println("输入有误");;
        }
    }
}
