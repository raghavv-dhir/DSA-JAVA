package ObjectOrientedProgramming;

public class constructors {
    public static void main(String[] args) {
        // Using Default Constructor
        Human human1 = new Human();
        System.out.println("Details of person1:");
        human1.displayDetails();

        // Using Parameterized Constructor
        Human human2 = new Human("Alice", 25);
        System.out.println("Details of person2:");
        human2.displayDetails();

        // Using Copy Constructor
        Human human3 = new Human(human2);
        System.out.println("Details of person3:");
        human3.displayDetails();
    }
}

// Define a class named Human
class Human {
    // Properties (Attributes) of the class
    String name;
    int age;

    // 1. Default Constructor
    Human() {
        this.name = "Unknown";     //'this' refers to the current object(human1)
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Human(String name, int age) {
        this.name = name;     //'this' refers to the current object(human2)
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Copy Constructor
    Human(Human anotherHuman) {
        this.name = anotherHuman.name;    //'this' refers to the current object(human3)
        this.age = anotherHuman.age;
        System.out.println("Copy Constructor Called");
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

//1. Default Constructor:
//A constructor with no parameters.
//Used to initialize an object with default values.

//2. Parameterized Constructor:
//A constructor that accepts parameters to initialize an object with specific values.

//3. Copy Constructor:
//A constructor that creates a new object by copying the attributes of another object.
