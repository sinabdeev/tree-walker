package core;

public class MyNode {

    public MyNode(String name) {
        this.name = name;
    }

    private final String name;

    private MyNode left;

    private MyNode right;

    public String getName() {
        return name;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }
}
