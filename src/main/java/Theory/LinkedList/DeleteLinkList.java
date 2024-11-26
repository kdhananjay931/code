package Theory.LinkedList;

public class DeleteLinkList {

    static class Node{
         int data;
         Node next;
         Node prev;
         Node(int data){
             this.data=data;
         }

    }
    static void deleteHead(Node head){
        Node temp=head;
        if(temp!=null){
            head= head.next;
        }

    }
    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a= new Node(45);
        Node b= new Node(67);
        Node c= new Node(65);
        Node d= new Node(78);
        Node e= new Node(90);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;

        display(a);
        deleteHead(a);
        display(a);
    }
}
