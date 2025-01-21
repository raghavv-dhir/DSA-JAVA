package LinkedList;

public class CircularLinkedList {
    //Node class
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        Node current = head;
        Node previous = null;

        // Case 1: Only one node in the list
        if (head == tail && head.value == value) {
            head = tail = null;
            System.out.println("Deleted the only node: " + value);
            return;
        }

        // Case 2: Deleting the head node
        if (head.value == value) {
            tail.next = head.next; // Update tail's next to the new head
            head = head.next;      // Update the head
            System.out.println("Deleted the head node: " + value);
            return;
        }

        // Case 3: Deleting a node from the middle or end
        do {
            previous = current;
            current = current.next;
            if (current.value == value) {
                previous.next = current.next; // Bypass the current node
                // If deleting the tail, update it
                if (current == tail) {
                    tail = previous;
                }
                System.out.println("Deleted node: " + value);
                return;
            }
        } while (current != head); // Traverse until we circle back to the head

        // If the value is not found
        System.out.println("Value " + value + " not found in the list.");
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value+" -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void returnSize(){
        System.out.println("Size: "+size);
    }
}
