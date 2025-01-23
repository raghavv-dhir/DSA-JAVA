package LinkedList.ImportantQuestions;

public class OddEvenLinkedList {
    //Node class
    private static class ListNode {
        int val;
        ListNode next;
        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode oddEvenList(ListNode head){
        if (head == null) return null;

        ListNode oddDummy = new ListNode(0); // Dummy head for odd nodes
        ListNode evenDummy = new ListNode(0); // Dummy head for even nodes
        ListNode odd = oddDummy; // Pointer for the odd list
        ListNode even = evenDummy; // Pointer for the even list
        ListNode curr = head; // Pointer to traverse the original list
        int index = 1; // Start with the first node as odd

        // Traverse the original list and separate nodes into odd and even lists
        while (curr != null) {
            if (index % 2 == 1) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            index++;
        }

        // Terminate the even list to avoid potential cycles
        even.next = null;
        // Link the end of the odd list to the beginning of the even list
        odd.next = evenDummy.next;

        return oddDummy.next; // Return the head of the merged list
    }
}
