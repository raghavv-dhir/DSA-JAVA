package StacksAndQueues;

import java.util.Stack;

public class InBuiltStackExample {
    public static void main(String[] args) {
        // Using inbuilt Stack class in Java.
        // Creating a stack and pushing elements onto it.
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        // Popping elements from the stack.
        System.out.println("POP: "+stack.pop()); //returns 18(last)
        System.out.println("POP: "+stack.pop()); //returns 9
        System.out.println("POP: "+stack.pop()); //returns 2
        System.out.println("POP: "+stack.pop()); //returns 45
        System.out.println("POP: "+stack.pop()); //returns 34(first)
        //System.out.println(stack.pop()); //Empty stack exception(Error)
    }
}
//Stacks uses the LIFO(Last in first out) or FILO(First in Last out) principle. Internally stacks are also arrays.
