import org.w3c.dom.Node;

public class LinkedListImplementation {

    // Inner Node class
    static class Node {
        int data;
        Node next;
    }

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.show();
    }
}

//sorting
//public class LinkedListImplementation {
//
//    // Inner Node class
//    static class Node {
//        int data;
//        Node next;
//    }
//
//    Node head;
//
//    // Method to insert a new node
//    public void insert(int data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//
//        if (head == null) {
//            head = node;
//        } else {
//            Node n = head;
//            while (n.next != null) {
//                n = n.next;
//            }
//            n.next = node;
//        }
//    }
//
//    // Method to display the linked list
//    public void show() {
//        Node node = head;
//        while (node != null) {
//            System.out.println(node.data);
//            node = node.next;
//        }
//    }
//
//    // Bubble Sort method to sort the linked list
//    public void sort() {
//        if (head == null) {
//            return; // List is empty, no sorting needed
//        }
//
//        Node current, index;
//        int temp;
//
//        // Traverse the list
//        for (current = head; current.next != null; current = current.next) {
//            for (index = current.next; index != null; index = index.next) {
//                // Swap the data if current node is greater than the next node
//                if (current.data > index.data) {
//                    temp = current.data;
//                    current.data = index.data;
//                    index.data = temp;
//                }
//            }
//        }
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        LinkedListImplementation list = new LinkedListImplementation();
//        list.insert(18);
//        list.insert(45);
//        list.insert(12);
//        list.insert(30);
//        list.insert(10);
//
//        System.out.println("Original List:");
//        list.show();
//
//        // Sort the linked list
//        list.sort();
//
//        System.out.println("Sorted List:");
//        list.show();
//    }
//}
