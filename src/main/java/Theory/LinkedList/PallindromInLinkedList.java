package Theory.LinkedList;

public class PallindromInLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    static boolean palin(Node head ,Node tail){
        Node h=head;
        Node t =tail;
        while (t!=h){
            if(t.data!=h.data)return false;
            h=h.next;
            t=t.prev;
        }
        return true;

    }
    static void display(Node head){
        Node temp=head;
        while (temp.next!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a= new Node(45);
        Node b= new Node(67);
        Node c= new Node(65);
        Node d= new Node(67);
        Node e= new Node(45);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        System.out.println(palin(a,e));
    }
}
