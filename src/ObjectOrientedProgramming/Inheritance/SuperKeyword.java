package ObjectOrientedProgramming.Inheritance;

public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("Demonstrating the 'super' keyword in Java");

        // Create an instance of the Dog class
        Dog dog = new Dog("Munna", "Pom");

        // Call overridden method
        dog.sound();

        // Display details of the dog
        dog.displayDetails();
    }
}

// Parent class
class Animal {
    String name;

    //constructor of parent class
    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called for "+name);
    }

    //Method in the parent class
    void sound(){
        System.out.println("Animals make sounds.");
    }
}

// Child class
class Dog extends Animal{
    String breed;

    //constructor of the child class
    Dog(String name, String breed){
        super(name); // Call to parent class constructor
        this.breed = breed;
        System.out.println("Dog constructor called for "+name+", Breed "+breed);
    }

    @Override  // Overriding the parent class method
    void sound() {
        super.sound(); // Call the parent class method
        System.out.println("Dogs bark.");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

/*
Uses of super keyword:
The super keyword in Java is primarily used in the following ways:

Access Parent Class Constructor:
You can use super() to call the constructor of the parent class from a child class. This is particularly useful for initializing inherited attributes or performing setup operations defined in the parent class.

Access Parent Class Method:
If a child class overrides a method from the parent class, the super keyword can be used to call the parent class version of the method. This helps in reusing or extending functionality.

Access Parent Class Field:
In situations where the child class has a field with the same name as the parent class, the super keyword allows access to the parent class field explicitly.
 */
