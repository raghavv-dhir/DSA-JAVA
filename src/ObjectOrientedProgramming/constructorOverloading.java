package ObjectOrientedProgramming;

public class constructorOverloading {
    public static void main(String[] args) {
        // Using Default Constructor
        Man man1 = new Man();
        man1.displayDetails();

        Man man2 = new Man("Raghav", 20);
        man2.displayDetails();

        Man man3 = new Man("Manav",24,"Gurgaon");
        man3.displayDetails();
    }
}

//Define a class named "Man"
class Man{
    //Properties
    String name;
    int age;
    String city;

    //Default constructor
    Man(){
        this.name = "Unknown";
        this.age = 0;
        this.city = "Not specified";
        System.out.println("Default Constructor Called");
    }

    //Constructor with 2 parameters(name & age)
    Man(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor with Name and Age Called");
    }

    //Constructor with 3 parameters(name, age & city)
    Man(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Constructor with Name, Age and City Called");
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("City: " + this.city);
    }
}

//Constructor overloading allows a class to have multiple constructors, each with a different parameter list. This provides flexibility in initializing objects in different ways.
