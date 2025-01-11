package ObjectOrientedProgramming;

public class classesObjects {
    public static void main(String[] args) {
        //Create an object of the car class
        //Use the 'new' keyword to create an object of the Person class
        Car car1 = new Car();

        //Set the properties of car1
        //The properties and attributes of the class can be accessed by using the dot (.) operator
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2021;

        //Display the details of car1
        System.out.println("Details of car1:");
        car1.displayDetails();

        //Create another object of the car class
        Car car2 = new Car();

        //Set properties of car2
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2020;

        //Display details of car2
        System.out.println("Details of car2:");
        car2.displayDetails();
    }
}

//Define a class named "Car"
class Car {
    //Properties (attributes) of the car
    String brand;   //instance variable
    String model;   //instance variable
    int year;       //instance variable

    //Method to display car details
    void displayDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}
//Class: A blueprint for objects (Car). It is just a logical construct.
//Object: Instances of the class (car1, car2). It is a physical reality and occupies space in memory.