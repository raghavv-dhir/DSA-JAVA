package ObjectOrientedProgramming;

public class staticBlock {
    static {
        System.out.println("Static Block 1 Executed!");
    }
    static {
        System.out.println("Static block 2 Executed!");
    }

    public static void main(String[] args) {
        //It is compulsory to create main method to execute static blocks after jdk version 1.6.
        //Now static block is executed exactly once automatically when the class loads in memory. It is executed even before anything inside main method.
        System.out.println("Main method executed");
    }

    static {  //Even this static block will be executed before main method
        System.out.println("Static block 3 executed!");
    }
}
