package Theory.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> a=new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.remove());
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.peek());

    }
}
