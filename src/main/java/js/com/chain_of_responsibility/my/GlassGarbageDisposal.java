package js.com.chain_of_responsibility.my;

/**
 * @Title: PlasticGarbageDisposal
 * @Description: 玻璃垃圾处理
 * @author chy
 * @date 2018/5/14 10:18
 */
public class GlassGarbageDisposal extends GarbageDisposal {

    private final String type="玻璃";

    @Override
    public void doGarbageDisposal(String garbage) {
        if(garbage.contains(type)){
            System.out.println("玻璃垃圾处理------->"+garbage);
        }
        else{
            this.nextGarbageDisposal.doGarbageDisposal(garbage);
        }
    }
}
