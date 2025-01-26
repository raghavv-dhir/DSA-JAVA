package StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        //stack.push(5); //throws exception because size == 5

        System.out.println("PEEK: "+stack.peek());

        System.out.println("POP: "+stack.pop()); //returns 18(last)
        System.out.println("POP: "+stack.pop()); //returns 9
        System.out.println("POP: "+stack.pop()); //returns 2
        System.out.println("POP: "+stack.pop()); //returns 45
        System.out.println("POP: "+stack.pop()); //returns 34(first)
        //System.out.println(stack.pop()); //throws Exception
    }
}
