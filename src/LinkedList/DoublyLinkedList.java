package LinkedList;

public class DoublyLinkedList {

    // Node class
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    // Insert at the beginning
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.prev = null;
        newNode.next = head;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        Node temp = head;
        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    public void insert(int after, int value){
        Node node = new Node(value);
        Node prev = find(after);
        if (prev == null){
            System.out.println("Does not exist");
            return;
        }
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if (node.next != null){
            node.next.prev = node;
        }
        size++;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

     public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println("Displaying in reverse:");
        while(last != null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }

    public void returnSize(){
        System.out.println("Size: "+ size);
    }
}
