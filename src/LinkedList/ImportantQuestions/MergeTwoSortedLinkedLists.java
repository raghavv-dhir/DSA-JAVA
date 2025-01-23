package LinkedList.ImportantQuestions;

public class MergeTwoSortedLinkedLists {
    //ListNode class
    private static class ListNode {
        private int val;
        private ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){ //With extra space
        // Initialize pointers for both lists
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        // Create a dummy node to serve as the head of the merged list
        ListNode dummy = new ListNode(0);
        // Temp pointer to build the new list
        ListNode temp = dummy;
        // Loop until we reach the end of one of the lists
        while (temp1 != null && temp2 != null){
            // Compare the current nodes of both lists
            if(temp1.val < temp2.val){
                // Create a new node with the smaller value from temp1
                ListNode a = new ListNode(temp1.val);
                // Link the new node to the merged list
                temp.next = a;
                // Move the temp pointer forward
                temp = a;
                // Advance temp1 to the next node in list1
                temp1 = temp1.next;
            } else {
                // Create a new node with the smaller or equal value from temp2
                ListNode b = new ListNode(temp2.val);
                // Link the new node to the merged list
                temp.next = b;
                // Move the temp pointer forward
                temp = b;
                // Advance temp2 to the next node in list2
                temp2 = temp2.next;
            }
        }
        // Attach any remaining nodes from list1 or list2
        if (temp1 == null){
            // If temp1 is exhausted, link the rest of temp2
            temp.next = temp2;
        } else {
            // If temp2 is exhausted, link the rest of temp1
            temp.next = temp1;
        }
        // Return the merged list, starting after the dummy node
        return dummy.next;
    }


    public ListNode merge2(ListNode list1, ListNode list2){ //without using extra space
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null){
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }
}
