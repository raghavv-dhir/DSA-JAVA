package LinkedList.ImportantQuestions;

public class DeleteNode237 {
    //Leetcode: 237
    //Ex: 4 -> 5 -> 1 -> 9 (Given node: 5)
    //    4 -> 1 -> 9
    //We are not given access to the head node, we have only access to the node which we need to delete.
    public void deleteNode(ListNode node){
        node.val = node.next.val; //Copy the data of the next node and store it in the given node.
        node.next = node.next.next; //Now delete the connection of the next node.
        //Now technically the node is deleted(Not the node, but its data actually).
        //But if the given node is the last node of the linked list, we can't do this, because next will be null, and it will give error.
    }

    //Node class
    private class ListNode{
        int val;
        ListNode next;

        //constructor
        public ListNode(int x){
            val = x;
        }
    }
}
