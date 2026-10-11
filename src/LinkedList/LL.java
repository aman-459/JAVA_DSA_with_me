package LinkedList;

class LinkedList {

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    void printSize() {
        System.out.println(this.size);
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    void insertFirst(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    void insertLast(int val) {
        Node temp = new Node(val);
        if(tail == null) {
            tail = temp;
            head = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertIdx(int val, int idx) {
        if(idx > size) {
            System.out.println("Index out of bound");
            return;
        }
        else if(idx == 1) insertFirst(val);
        else if(idx == size-1) insertLast(val);
        else {
            Node newNode = new Node(val);
            Node temp = head;
            for(int i = 1; i < idx-1; i++) temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        else if(head.next == null) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    void deleteLast() {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        else if(head.next == null) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            for(int i = 1; i < size-1; i++) temp = temp.next;
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    void deleteIdx(int idx) {
        if(idx < 1 || idx > size) {
            System.out.println("invalid index!");
            return;
        }
        if(idx == 1) deleteFirst();
        else if(idx == size) deleteLast();
        else {
            Node temp = head;
            for(int i = 1; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    boolean isThere(int n) {
        Node temp = head;
        while (temp != null) {
            if(temp.val == n) return true;
            temp = temp.next;
        }
        return false;
    }

    void reverse() {
        Node temp = head;
        helper(temp);
    }

    void helper(Node temp) {
        if(temp == null) return;
        helper(temp.next);
        System.out.print(temp.val+" ");
    }

}

public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.display();
        System.out.println();
        ll.reverse();


//        // Base case: empty list
//        ll.display(); // should print nothing
//        ll.deleteFirst(); // "List is empty!"
//        ll.deleteLast();  // "List is empty!"
//        System.out.println("Is 10 there? " + ll.isThere(10)); // false
//
//        // Insert first on empty
//        ll.insertFirst(10);
//        ll.display(); // 10
//        System.out.println();
//
//        // Insert last on single element
//        ll.insertLast(20);
//        ll.display(); // 10 20
//        System.out.println();
//
//        // Insert at index
//        ll.insertIdx(15, 2); // between 10 and 20
//        ll.display(); // 10 15 20
//        System.out.println();
//
//        // Delete first
//        ll.deleteFirst();
//        ll.display(); // 15 20
//        System.out.println();
//
//        // Delete last
//        ll.deleteLast();
//        ll.display(); // 15
//        System.out.println();
//
//        // Delete index (only one element left)
//        ll.deleteIdx(1);
//        ll.display(); // empty
//        System.out.println();
//
//        // Search test
//        ll.insertLast(30);
//        ll.insertLast(40);
//        System.out.println("Is 40 there? " + ll.isThere(40)); // true
//        System.out.println("Is 100 there? " + ll.isThere(100)); // false
//
//        // Size check
//        ll.printSize(); // should show 2

//        // Insert at beginning
//        ll.insertFirst(10);
//        ll.insertFirst(20);
//        ll.insertFirst(30);
//        System.out.print("After insertFirst: ");
//        ll.display();
//        System.out.println();
//
//        // Insert at end
//        ll.insertLast(40);
//        ll.insertLast(50);
//        System.out.print("After insertLast: ");
//        ll.display();
//        System.out.println();
//
//        // Insert at index
//        ll.insertIdx(100, 3); // insert at position 3
//        System.out.print("After insertIdx(100,3): ");
//        ll.display();
//        System.out.println();
//
//        // Delete first
//        ll.deleteFirst();
//        System.out.print("After deleteFirst: ");
//        ll.display();
//        System.out.println();
//
//        // Delete last
//        ll.deleteLast();
//        System.out.print("After deleteLast: ");
//        ll.display();
//        System.out.println();
//
//        // Delete at index
//        ll.deleteIdx(3);
//        System.out.print("After deleteIdx(3): ");
//        ll.display();
//        System.out.println();
//
//        // Check size
//        ll.printSize();
//        System.out.println();
//
//        // Search
//        System.out.println("Is 40 there? " + ll.isThere(40));
//        System.out.println("Is 200 there? " + ll.isThere(200));
    }
}
