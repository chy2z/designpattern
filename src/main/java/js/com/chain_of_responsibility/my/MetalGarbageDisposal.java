package js.com.chain_of_responsibility.my;

/**
 * @Title: PlasticGarbageDisposal
 * @Description: 金属垃圾处理
 * @author chy
 * @date 2018/5/14 10:18
 */
public class MetalGarbageDisposal extends GarbageDisposal {

    private final String type="金属";

    @Override
    public void doGarbageDisposal(String garbage) {
        if(garbage.contains(type)){
            System.out.println("金属垃圾处理------->"+garbage);
        }
        else{
            this.nextGarbageDisposal.doGarbageDisposal(garbage);
        }
    }
}
