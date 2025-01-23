package LinkedList.ImportantQuestions;

public class RemoveDuplicates {
    //ListNode class
    private static class ListNode {
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        //If the list is empty or contains only one node, return it
        if(head == null || head.next == null)
            return head;

        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

        return head;
    }
}
