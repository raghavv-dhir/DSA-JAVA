package LinkedList.ImportantQuestions;

import static LinkedList.ImportantQuestions.displayReverse.displayReverseIteratively;

public class TwinSum {
    //Node class
    private static class ListNode {
        int val;
        ListNode next;
        //constructor
        public ListNode(int x){
            val = x;
        }
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
    public static int pairSum(ListNode head){
        int max = Integer.MIN_VALUE;
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
            max = Math.max(max, p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(pairSum(a));
    }
}
