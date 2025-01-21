package LinkedList;

public class SinglyLinkedList {

    //Node class
    private class Node {
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

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size-1){
            insertLast(value);
            return;
        }
        Node prev = get(index-1);
        prev.next = new Node(value, prev.next);
        size++;
    }

    public void deleteFirst(){
        int value = head.value;
        head = head.next;
        size--;
    }

    public void deleteLast(){
        tail = get(size-2);
        tail.next = null;
        size--;
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

    public void delete(int index){
        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == size-1){
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size--;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void returnSize(){
        System.out.println("Size: "+size);
    }
}
