package js.com.composite.my;


/**
 * 组合模式: 将对象组合成树形结构以表示"部分-整体"的层次结构
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 * 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 * Created by Administrator on 2015/4/23.
 */
public class Client {

    public static void main(String[] args){

        TreeNode root= new TreeNode("根");

        TreeNode node1= new TreeNode("节点1");
        node1.add(new LeafNode("1-1"));
        node1.add(new LeafNode("1-1"));

        TreeNode node2= new TreeNode("节点2");
        node2.add(new LeafNode("2-1"));
        node2.add(new LeafNode("2-1"));

        root.add(node1);
        root.add(node2);
    }

}
