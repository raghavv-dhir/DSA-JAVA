package LinkedList.ImportantQuestions;

import java.util.List;

public class Cycle2 {
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode detectCycle(ListNode head){
        if (head == null || head.next == null) return null; //No cycle is possible in empty or single node list
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle using Floyd’s algorithm
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){ //cycle detected
                // Step 2: Find the start of the cycle
                ListNode temp = head;
                while (slow != temp){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow; // Start of the cycle
            }
        }
        return null; // No cycle found
    }
}
