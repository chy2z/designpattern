package js.com.composite;

/**
 * 组合模式: 将对象组合成树形结构以表示"部分-整体"的层次结构
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 * 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 * Created by Administrator on 2015/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("LeafNode A"));
        root.add(new Leaf("LeafNode B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("LeafNode XA"));
        comp.add(new Leaf("LeafNode XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("LeafNode XYA"));
        comp2.add(new Leaf("LeafNode XYB"));

        comp.add(comp2);

        root.add(new Leaf("LeafNode C"));

        Leaf leaf = new Leaf("LeafNode D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);

    }
}
