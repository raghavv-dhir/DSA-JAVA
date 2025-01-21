package LinkedList.ImportantQuestions;

public class RemoveNthNodeFromEnd {
    //Node class
    private static class Node {
        int val;
        Node next;

        //constructor
        public Node(int x){
            val = x;
        }
    }

    public static Node RemoveNthFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null){ //means if the node to be deleted from the end is head(size), then fast will reach to the null and give error, therefore we deleted the head here.
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
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
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //100 -> 13 -> 4 -> 5 -> 12 -> 10
        display(a);
        a = RemoveNthFromLast(a,6);
        display(a);
    }
}
