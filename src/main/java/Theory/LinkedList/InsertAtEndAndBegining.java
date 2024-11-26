package Theory.LinkedList;

public class InsertAtEndAndBegining {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;


            }
            tail = temp;
        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;

            } else {
                temp.next = head;
                head = temp;

            }
        }
        void insertAt(int index,int val){
            Node t=new Node(val);
            Node temp= head;
            if(index==0){
                insertAtBeginning(val);
                return;
            }
            else if(index<0 || index>size()){
                System.out.println("Wrong index");
                return;
            }
            if(index==size()){
                insertAtEnd(val);
                return;
            }
            for (int i = 0; i <index-1 ; i++) {
                temp=temp.next;

            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int index){
            Node temp=head;
            for (int i = 0; i <index ; i++) {
                temp=temp.next;

            }
            return temp.data;
        }
        void deleteAt(int index){
            if(index==0)
                head= head.next;
            Node temp=head;
            for (int i = 1; i <index-1 ; i++) {
                temp=temp.next;

            }
            temp.next=temp.next.next;
            tail=temp;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtEnd(9);
        ll.display();
        ll.insertAtBeginning(3);
        ll.display();
        ll.insertAtBeginning(10);
        ll.display();
        ll.insertAt(3,18);
        ll.insertAt(4,19);
        ll.display();
        System.out.println(ll.size());

        System.out.println(ll.getAt(2));
        ll.deleteAt(0);
        ll.display();
    }
}
