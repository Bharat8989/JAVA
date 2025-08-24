package LinkedList;
// Singly Linked List Implementation in Java
class SinglyLinkedList {
    
    // Node class
    class Node {
        int data;       // value
        Node next;      // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // start of the list

    // 1️⃣ Traversal - Display 
    void display() {
        if (head == null) {
            System.out.println("List  empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // 2️⃣ Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3️⃣ Insert at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 4️⃣ Insert at Position
    void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // 5️⃣ Delete from Beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // 6️⃣ Delete from End
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // 7️⃣ Delete from Position
    void deleteFromPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        current.next = current.next.next;
    }

    // 8️⃣ Reverse the List
    void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // 🔹 Main function
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Original List:");
        list.display();   // 10 → 20 → 30 → NULL

        // Insert at beginning
        list.insertAtBeginning(5);
        System.out.println("After inserting 5 at beginning:");
        list.display();   // 5 → 10 → 20 → 30 → NULL

        // Insert at position
        list.insertAtPosition(15, 3);
        System.out.println("After inserting 15 at position 3:");
        list.display();   // 5 → 10 → 15 → 20 → 30 → NULL

        // Delete from beginning
        list.deleteFromBeginning();
        System.out.println("After deleting from beginning:");
        list.display();   // 10 → 15 → 20 → 30 → NULL

        // Delete from end
        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.display();   // 10 → 15 → 20 → NULL

        // Delete from position
        list.deleteFromPosition(2);
        System.out.println("After deleting from position 2:");
        list.display();   // 10 → 20 → NULL

        // Reverse
        list.reverse();
        System.out.println("After reversing the list:");
        list.display();   // 20 → 10 → NULL
    }
}
