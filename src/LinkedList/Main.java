package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertAtFirst(10);
//        list.insertAtFirst(9);
//        list.insertAtFirst(8);
//        list.insertAtFirst(7);
//        list.insertAtFirst(6);
//        list.insertAtFirst(5);
//        list.insertAtLast(11);
//        list.insertAtRandom(20, 6);
//        list.display();
//        list.deleteRandom(2);
//        list.display();
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.display();
        list.displayReverse();
    }
}
