package LinkedList.ImportantQuestions;

public class DeletingMiddleElement {

    //Node class
    private static class Node {
        int val;
        Node next;

        //constructor
        public Node(int x){
            val = x;
        }
    }

    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        if (head.next == null){
            return null;
        }
        while(fast.next.next!=null && fast.next.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
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
        a = deleteMiddle(a);
        display(a);
    }
}
