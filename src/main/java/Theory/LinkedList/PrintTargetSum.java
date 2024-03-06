package Theory.LinkedList;

public class PrintTargetSum {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static void printTarget(Node head, Node tail, int target) {
        Node h = head;
        Node t = tail;

        while (t.data != h.data) {
            if (h.data + t.data == target) {
                System.out.println(target);
                break;
            } else if (h.data + t.data > target) {


                t = t.prev;
            } else {

                h = h.next;

            }
        }

    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(15);
        Node d = new Node(17);
        Node e = new Node(20);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
        printTarget(a, e, 31);
    }
}