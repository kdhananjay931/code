package Theory.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeQ {

    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);
        System.out.println(dq);
    }
}
