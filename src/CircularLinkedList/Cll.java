package CircularLinkedList;


class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    void printSize() {
        System.out.println(this.size);
    }
    private class Node {
        private Node next;
        private int val;

        Node(int val) {
            this.val = val;
        }

    }

    void display() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.val+" ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    void insertFirst(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        tail.next = head;
        size++;
    }

    void insertLast(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            tail.next = temp;
            head = temp;
        }
        size++;
    }
}
public class Cll {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.display();
        //cll.insertFirst(10);
        //cll.insertFirst(20);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.display();
    }
}
