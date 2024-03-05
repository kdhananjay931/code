package Theory.LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    static Node RemoveNthNodeEnd(Node head, int index){
        Node slow=head;
        Node fast=head;
        for (int i = 0; i <index ; i++) {
            fast=fast.next;
        }
        if(fast==null){
            head= head.next;
            return head;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
       slow.next=slow.next.next;
        return head;

    }
   static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(300);
        Node e=new Node(400);
        Node f=new Node(500);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        a=RemoveNthNodeEnd(a,6);
        display(a);


    }
}
