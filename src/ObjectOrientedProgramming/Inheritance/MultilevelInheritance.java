package ObjectOrientedProgramming.Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("Demonstrating Multilevel Inheritance in Java");

        // Create an instance of the Puppy class
        Puppy puppy = new Puppy("Buddy", "Golden Retriever", 1);

        // Call methods from the parent, intermediate, and child classes
        puppy.sound(); // Inherited and overridden
        puppy.play(); // Specific to Puppy class
    }
}

class Animal2 {
    String name;

    Animal2(String name){
        this.name = name;
        System.out.println("Animal2 constructor called for "+name);
    }
    void sound(){
        System.out.println("Animal2 class method");
    }
}

class Dog2 extends Animal2 {
    String breed;

    Dog2(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println("Dog2 constructor called for "+name+" and breed "+breed);
    }
    @Override
    void sound(){
        System.out.println(name+" says woof woof!");
    }
}

class Puppy extends Dog2{
    int age;

    Puppy(String name, String breed, int age){
        super(name, breed);
        this.age = age;
        System.out.println("Puppy constructor called for "+name+" and age "+age);
    }
    void play() {
        System.out.println(name + " is playing!");
    }

}
