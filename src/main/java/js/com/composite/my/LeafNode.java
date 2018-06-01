package js.com.composite.my;

/**
* @Title: LeafNode
* @Description: 叶子节点
* @author chy
* @date 2018/5/15 9:52
*/
public class LeafNode extends Node {


    public LeafNode(String name) {
        super(name);
    }

    @Override
    public void add(Node c) {
        System.out.println("Can not add");
    }

    @Override
    public void remove(Node c) {
        System.out.println("Can not remove");
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++){
            System.out.print("-");
        }
        System.out.print(name);
        System.out.println("");
    }
}
