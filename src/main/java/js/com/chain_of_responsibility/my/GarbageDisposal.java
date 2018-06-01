package js.com.chain_of_responsibility.my;

/**
* @Title: GarbageDisposal
* @Description: 垃圾处理
* @author chy
* @date 2018/5/14 10:16
*/
public abstract class GarbageDisposal {

    protected GarbageDisposal nextGarbageDisposal;

    public void setNextGarbageDisposal(GarbageDisposal garbageDisposal) {
        this.nextGarbageDisposal = garbageDisposal;
    }

    public abstract void doGarbageDisposal(String garbage);
}
