package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltDequeueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque);
        deque.add(89);
        System.out.println(deque);
        deque.addLast(78);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}

//Here insertion and deletion happens from both the ends