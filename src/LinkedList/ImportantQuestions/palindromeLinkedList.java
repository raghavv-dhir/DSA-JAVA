package LinkedList.ImportantQuestions;

public class palindromeLinkedList {
    //ListNode class
    private static class ListNode {
        int val;
        ListNode next;
        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = displayReverseIteratively(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2 != null){
            if (p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static ListNode displayReverseIteratively(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode agla = null;
        while(current != null){
            agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(isPalindrome(a));
    }
}
