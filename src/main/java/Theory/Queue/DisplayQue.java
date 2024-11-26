package Theory.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQue {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        Queue<Integer> helper=new ArrayDeque<>();
        while (a.size()>0){
            System.out.println(a.peek() +" ");
            helper.add(a.remove());
        }
        while (helper.size()>0){
            a.add(helper.remove());
        }
    }
}