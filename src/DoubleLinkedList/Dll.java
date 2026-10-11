package DoubleLinkedList;

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    void printSize() {
        System.out.println(this.size);
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void revDisplay() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertFirst(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertLast(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteFirst() {
        if(head == null) {
            System.out.println("List empty!");
            return;
        }else if(head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteLast() {
        if(head == null) {
            System.out.println("List empty!");
            return;
        } else if(head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
}


public class Dll {
    public static void main(String[] args) {
        System.out.println("Hello DoublyLinkedList");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
       dll.insertFirst(50);
       dll.insertLast(60);
       dll.insertLast(70);
       dll.display();
//        dll.revDisplay();
//        dll.printSize();
//        dll.deleteFirst();
//        dll.deleteFirst();
        dll.display();
        dll.deleteLast();
        dll.deleteLast();
        dll.display();

    }
}
