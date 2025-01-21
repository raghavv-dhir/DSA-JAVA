package LinkedList.ImportantQuestions;

public class NthNodeFromEnd {
    //Node class
    private static class Node {
        int val;
        Node next;

        //constructor
        public Node(int x){
            val = x;
        }
    }

    public static Node nthNode(Node head, int n){  //This method will be completed by traversing the list 2 times.
        int size = 0;
        Node temp = head;
        while(temp!= null){
            size++; //total nodes
            temp = temp.next;
        }
        int m = size - n + 1;
        //mth node from start
        temp = head;
        for (int i = 1; i <= m-1; i++) {
            temp = temp.next;  //reached till that node
        }
        return temp;
    }

    public static Node nthNodeOneTraversal(Node head, int n){  //This method will be completed by single traversal only.
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n ; i++) {
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
        Node temp = nthNode(a, 2);
        System.out.println(temp.val);
        temp = nthNodeOneTraversal(a, 1);
        System.out.println(temp.val);

    }
}
