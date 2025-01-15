package ObjectOrientedProgramming;

// Program to demonstrate Singleton Class in Java

class Singleton {
    // Step 1: Create a private static instance of the Singleton class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation from other classes
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Step 3: Provide a public static method to get the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) { // Check if instance is null
            instance = new Singleton(); // Create the instance if it doesn't exist
        } else {
            System.out.println("Returning existing Singleton instance.");
        }
        return instance;
    }

    // Method to demonstrate functionality of the Singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton class!");
    }
}

public class SingletonClasses {
    public static void main(String[] args) {
        System.out.println("Demonstrating Singleton Class");

        // Attempt to create multiple instances of Singleton
        Singleton instance1 = Singleton.getInstance();
        instance1.showMessage();

        Singleton instance2 = Singleton.getInstance();
        instance2.showMessage();

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}

