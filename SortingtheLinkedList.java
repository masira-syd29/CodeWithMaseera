public class SortingtheLinkedList {
    static class Node {
        int data;
        Node next;
    }
    Node head;
    public  void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    //bubble sort method to sort the linkedList
    public  void sort() {
        if(head == null) {
            return; //list is empty no sorting needed
        }
        Node curr, index;
        int temp;
        //traverse the list
        for(curr=head; curr.next!=null; curr=curr.next) {
            for(index=curr.next; index!=null; index=index.next) {
                //swap the data if current node is greater tha the next node
                if(curr.data > index.data) {
                    temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SortingtheLinkedList list = new SortingtheLinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insert(30);
        list.insert(10);

        System.out.println("Original List: ");
        list.show();

        //sorting linkedlist
        list.sort();

        System.out.println("Sorted List: ");
        list.show();
    }
}
