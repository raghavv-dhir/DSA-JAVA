package ObjectOrientedProgramming.Inheritance;

public class singleInheritance {
    public static void main(String[] args) {
        System.out.println("Demonstrating Single Inheritance in Java");

        // Create an instance of the Dog class
        Dog1 dog = new Dog1("Buddy", "Golden Retriever");

        // Call the method inherited and overridden
        dog.sound();

        // Display details of the dog
        dog.displayDetails();
    }
}

// Parent class
class Animal1 {
    String name;

    // Constructor of the parent class
    Animal1(String name) {
        this.name = name;
        System.out.println("Animal1 constructor called for: " + name);
    }

    // Method in the parent class
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class (inherits from Animal1)
class Dog1 extends Animal1 {
    String breed;

    // Constructor of the child class
    Dog1(String name, String breed) {
        super(name); // Call to parent class constructor
        this.breed = breed;
        System.out.println("Dog1 constructor called for: " + name + ", Breed: " + breed);
    }

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }

    // Method to display details specific to Dog1
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
