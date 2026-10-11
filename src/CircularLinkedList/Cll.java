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
        if(head == null) {
            System.out.println("List is empty!");
            return;
        } else {
            do {
                System.out.print(temp.val+" ");
                if(temp.next != null) temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
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

    void deleteFirst() {
        if(head == null) {
            System.out.println("List empty!");
            return;
        } else if(head.next == null) {
            head = head.next;
            tail = head;
        } else {
            tail.next = head.next;
            head = head.next;
        }
        size--;
    }

    void deleteLast() {
        if(head == null) {
            System.out.println("List empty!");
            return;
        } else if(head.next == null) {
            head = head.next;
            tail = head;
        } else {
            Node temp = head;
            for(int i = 1; i < size-1; i++) temp = temp.next;
            temp.next = head;
            tail = temp;
        }
        size--;
    }
}
public class Cll {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.display();
        //cll.insertFirst(100);
       // cll.insertFirst(20);
//       cll.insertLast(30);
//        cll.insertLast(40);
//        cll.insertFirst(10);
        cll.display();
        //cll.deleteFirst();
        cll.display();
        cll.deleteLast();
        cll.display();
    }
}
