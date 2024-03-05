package Theory.LinkedList;

import static Theory.LinkedList.FindNthNodeFromEnd.Node.NthNodeFromEnd;

public class FindNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        static Node NthNodeFromEnd(Node head , int Index) {
            Node slow=head;
            Node fast= head;
            for (int i = 0; i <Index; i++) {
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
return slow;
        }


    }

    public static void main(String[] args) {

        Node a= new Node(100);
        Node b= new Node(12);
        Node c= new Node(16);
        Node d= new Node(10);
        Node e= new Node(89);
        Node f= new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;


       Node q= NthNodeFromEnd(a, 1);
        System.out.println(q.data);

    }
}
