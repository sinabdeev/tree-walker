package core;

import java.util.ArrayDeque;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {

        MyNode x = new MyNode("x");
        MyNode a = new MyNode("a");
        MyNode b = new MyNode("b");
        x.setLeft(a); x.setRight(b);
        MyNode c = new MyNode("c");
        MyNode d = new MyNode("d");
        MyNode e = new MyNode("e");
        MyNode f = new MyNode("f");
        a.setLeft(c); a.setRight(d);
        b.setLeft(e); b.setRight(f);
        MyNode g = new MyNode("g");
        MyNode h = new MyNode("h");
        MyNode i = new MyNode("i");
        MyNode j = new MyNode("j");
        MyNode k = new MyNode("k");
        c.setLeft(g); c.setRight(h);
        d.setLeft(i); d.setRight(j);
        e.setLeft(k);
        MyNode m = new MyNode("m");
        i.setLeft(m);
        bfs(x);
    }

    static void bfs(MyNode node){
        Queue<MyNode> queue = new ArrayDeque<>();
        Queue<String> values = new ArrayDeque<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            MyNode tempNode = queue.poll();
            values.offer(tempNode.getName());
            if (tempNode.getLeft()!=null){
                queue.offer(tempNode.getLeft());
            }
            if (tempNode.getRight()!=null){
                queue.offer(tempNode.getRight());
            }
        }
        print(values);
    }

    static void print(Queue<String> queue){
        System.out.print(queue);
    }


}
