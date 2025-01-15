package ObjectOrientedProgramming.Inheritance;

public class Box {
    double length;
    double width;
    double height;

    //constructors
    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    //Cube:constructor
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Copy constructor
    Box(Box oldBox){
        this.length = oldBox.length;
        this.width = oldBox.width;
        this.height = oldBox.height;
    }
}

//Private members cannot be inherited outside this file.
//Child class can access all the properties of Parent class but parent cannot access child class's properties

