package LinkedList.ImportantQuestions;

public class MiddleOfLinkedList876 {

    //Leetcode: 876-> Given the head of a singly linked list, return the middle node of the linked list.If there are two middle nodes, return the second middle node.(Right middle in case of even)

    //Node class
    private static class Node {
        int val;
        Node next;

        //constructor
        public Node(int x){
            val = x;
        }
    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node LeftmiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        //1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void display(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        Node g = new Node(19);
        Node h = new Node(23);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        //100 -> 13 -> 4 -> 5 -> 12 -> 10 -> 19 -> 23
        display(a);
        System.out.println("Middle node: "+middleNode(a).val);
        System.out.println("Middle node: "+LeftmiddleNode(a).val);
    }
}
