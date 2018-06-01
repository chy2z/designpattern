package js.com.composite.my;

import java.util.ArrayList;
import java.util.List;

/**
* @Title: TreeNode
* @Description: 树节点
* @author chy
* @date 2018/5/15 9:53
*/
public class TreeNode extends Node {

    private List<Node> children = new ArrayList<Node>();

    public TreeNode(String name) {
        super(name);
    }

    @Override
    public void add(Node c) {
        children.add(c);
    }

    @Override
    public void remove(Node c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++){
            System.out.print("-");
        }
        System.out.print(name);
        System.out.println("");
        for(int i=0; i<children.size(); i++){
            children.get(i).display(depth + 2);
        }
    }
}
