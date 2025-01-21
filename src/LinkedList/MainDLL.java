package LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertLast(60);
        list.insert(20, 25);
        list.display();
        list.returnSize();
    }
}
