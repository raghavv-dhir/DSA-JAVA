package LinkedList.ImportantQuestions;

public class Cycle1 {
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public static boolean hasCycle(ListNode head){
        //slow & fast pointers
        ListNode slow = head;
        ListNode fast = head;

        //if at some point fast or fast.next becomes null, means no cycle in linked list
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            //But if at some point slow == fast, which is impractical in case of no cycle, means there is a cycle, then return true
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
