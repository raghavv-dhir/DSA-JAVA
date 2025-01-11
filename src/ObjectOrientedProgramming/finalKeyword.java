package ObjectOrientedProgramming;

public class finalKeyword {
    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();

        //displaying final variable
        demo.displayFinalVariable();

        //displaying final method
        demo.displayMessage();

        //Using Final class
        FinalClass finalClass = new FinalClass();
        finalClass.show();
    }
}


// A class demonstrating final variable, method, and class
class FinalDemo{
    //1. Final variable
    final int CONSTANT_VALUE = 100;

    //Method to display the value of the final variable
    void displayFinalVariable(){
        System.out.println("Final variable value: "+ CONSTANT_VALUE);
        //CONSTANT_VALUE = 200; // This would cause a compilation error because final variables cannot be reassigned
    }
    //2. Final Method
    final void displayMessage(){
        System.out.println("This is a final method and cannot be overridden");
    }
}
// A class attempting to override a final method (will cause a compilation error if uncommented)
// class SubClass extends FinalDemo {
//     @Override
//     void displayMessage() { // Compilation error: Cannot override the final method from FinalDemo
//         System.out.println("Attempting to override final method.");
//     }
// }


//A Final class
final class FinalClass{
    void show(){
        System.out.println("This is a final class and cannot be inherited!");
    }
}

// A class attempting to extend a final class (will cause a compilation error if uncommented)
// class SubClassOfFinal extends FinalClass {
    // Compilation error: Cannot inherit from final class
// }

