package ObjectOrientedProgramming;

public class newKeyword {
    public static void main(String[] args) {
        // Use the 'new' keyword to create an object of the Person class
        Person person1 = new Person("Alice", 25);

        // Display the details of person1
        System.out.println("Details of person1:");
        person1.displayDetails();

        // Create another object of the Person class using 'new'
        Person person2 = new Person("Bob", 30);

        // Display the details of person2
        System.out.println("\nDetails of person2:");
        person2.displayDetails();
    }
}

// Define a class named Person
class Person {
    // Properties (Attributes) of the class
    String name;
    int age;

    // Constructor to initialize Person objects
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

/*
Important theory related to "new" keyword

1. Dynamic Memory Allocation: The new keyword allocates memory on the heap dynamically. It ensures objects are created during runtime with required initialization.

2. Constructor Invocation: After memory allocation, the constructor is called to initialize the object.

3. Default Initialization: Without a constructor, the object’s properties are initialized to their default values (e.g., null for objects, 0 for integers).

4. Garbage Collection: Objects created with new remain in memory until no reference points to them, after which they are eligible for garbage collection.

 */