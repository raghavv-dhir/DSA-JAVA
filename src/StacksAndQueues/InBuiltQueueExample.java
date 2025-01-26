package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueueExample {
    public static void main(String[] args) {
        // Using inbuilt Queue class in Java.

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(71);
        queue.add(9);
        queue.add(12);
        queue.add(18);

        System.out.println(queue.peek()); //It will just get the item from the queue(3)
        System.out.println(queue.remove()); //It will remove the item from the queue(3)
        System.out.println(queue.remove()); //It will remove the item from the queue()
    }
}

//Queues uses FIFO(First in First out) or LILO(Last in Last out) principle.
