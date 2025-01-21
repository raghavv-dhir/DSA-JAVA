package LinkedList;

public class MainSLL {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertLast(60);
        list.insert(10,0);
        list.insert(70, 6);
        list.insert(25,2);
        list.deleteFirst();
        list.deleteLast();
        list.delete(1);
        list.display();
        list.returnSize();
    }
}
