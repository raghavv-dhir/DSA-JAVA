package ObjectOrientedProgramming;

public class staticMethod {
    //Rule 3:

    //static variable
    static int i = 10;  //It should always need to be static to go inside a static method.

    //static method
    static void display(){
        System.out.println(i++);  //Means only "static" people can come here.
        show();  //Now, as this method is "static", it can be called easily here!
    }

    //Rule 4
    //Non-static method -> Needs to be static to be called inside static method(display)
    static void show(){
        System.out.println("1");
        display();  //This method can also be called here, because it is also static
    }

    //Rule 5: As static methods do not depend on objects, therefore it is obvious that we cant relate them with "this" or "super" keywords because they are dependent on objects

    public static void main(String[] args) {
        display();  //Rule 2: Accessed directly without objects and without class name because we are still inside that same class.
        show();
        Xyz.show();  //Accessed without Objects and by class name because we are outside the class Xyz(either use "import" statement or use class name to access static methods outside class.)
    }
}

class Xyz{
    static void show(){
        System.out.println("2");
    }
}



/*
Rules for "static" methods
1. "static" methods belongs to the class, not to the object.
2. A "static" method can be accessed directly by class name and does not need any object creation.
3. A "static" method can only access static data. It cannot access non-static data(instance data).
4. A "static" method can call only other static methods and cannot call a non-static method.
5. A "static" method cannot refer to "this" or "super" keyword in any way.
 */
