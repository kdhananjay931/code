package Theory.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.add(q.remove());
        }
        System.out.println(st);
        for (int i = 0; i < k; i++) {
            q.add(st.pop());
        }
        System.out.println(q);
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
