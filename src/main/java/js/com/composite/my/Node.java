package js.com.composite.my;

/**
 * 节点
 */
public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract void add(Node c);

    public abstract void remove(Node c);

    public abstract void display(int depth);
}
