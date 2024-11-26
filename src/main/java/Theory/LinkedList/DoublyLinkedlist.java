package Theory.LinkedList;

public class DoublyLinkedlist {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }

    }
    static void doubly(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void doublyRev(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void doublyRandom(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
        public static Node insertAtHead(Node head,int x){

            Node t = new Node(x);
            t.next = head;
            head.prev = t;
            return t;


        }
        public static void insertAtTail(Node head, int x){
         Node temp=head;
         while (temp.next!=null){
            temp= temp.next;

         }
         Node t=new Node(x);
         temp.next=t;
         t.prev=temp;

        }

        public static void insertAtIndex(Node head, int x,int index){
        Node s=head;
            for (int i = 0; i <index-1 ; i++) {
                s=s.next;
            }
          Node r=s.next;
            Node t=new Node(x);
            r.prev=t;
            t.next=r;
            s.next=t;
            t.prev=s;
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

       /*doubly(a);
       doublyRav(e);
       doublyRandom(c);

       Node newList=insertAtHead(a,34);
        doubly(newList);


        insertAtTail(a,95);
        */
        doubly(a);
        insertAtIndex(a,35,3);
        doubly(a);

    }


}
