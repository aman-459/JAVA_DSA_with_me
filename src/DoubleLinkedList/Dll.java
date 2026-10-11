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

    void insertIdx(int val, int idx) {
        if(idx < 1 || idx > size) {
            System.out.println("Invalid Index!");
            return;
        } else if(idx == 1) insertFirst(val);
        else if(idx == size) insertLast(val);
        else {
            Node newNode = new Node(val);
            Node temp = head;
            for(int i = 1; i < idx-1; i++) temp = temp.next;
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }
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

    void deleteIdx(int idx) {
        if(idx < 1 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        if(idx == 1) deleteFirst();
        else if(idx == size) deleteLast();
        else {
            Node temp = head;
            for(int i = 1; i < idx-1; i++) temp = temp.next;
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if(toDelete.next != null) {
                toDelete.next.prev = temp;
            } else {
                tail = temp;
            }
            size--;
        }
    }
}


public class Dll {
    public static void main(String[] args) {
        System.out.println("Hello DoublyLinkedList");
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert at beginning
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.display();       // 20 10
        dll.revDisplay();    // 10 20

        // Insert at end
        dll.insertLast(30);
        dll.insertLast(40);
        dll.display();       // 20 10 30 40

        // Insert at index
        dll.insertIdx(100, 3);
        dll.display();       // 20 10 100 30 40

        // Delete first
        dll.deleteFirst();
        dll.display();       // 10 100 30 40

        // Delete last
        dll.deleteLast();
        dll.display();       // 10 100 30

        // Delete at index
        dll.deleteIdx(2);
        dll.display();    // 10 30
        dll.revDisplay();

        // Size check
        dll.printSize();     // Size: 2

//        dll.insertLast(10);
//        dll.insertLast(20);
//        dll.insertLast(30);
//        dll.insertLast(40);
//       dll.insertLast(50);
//       dll.insertLast(60);
//       dll.insertLast(70);
//       dll.display();
////        dll.revDisplay();
////        dll.printSize();
////        dll.deleteFirst();
////        dll.deleteFirst();
//        dll.insertIdx(100, 5);
//        dll.display();
//        dll.revDisplay();
//        dll.deleteIdx(5);
//        dll.insertIdx(90, -7);
//        dll.display();
//        //dll.revDisplay();

    }
}
