package LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Original list:");
        list.display();

        list.delete(10); //delete head
        list.display();

        list.delete(40); //delete tail
        list.display();

        list.delete(25); //non-existing value
        list.display();

        list.delete(30); //delete middle
        list.display();

        list.delete(20); //last remaining node
        list.display();
    }
}
