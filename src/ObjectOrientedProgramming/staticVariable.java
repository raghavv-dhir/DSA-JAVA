package ObjectOrientedProgramming;

public class staticVariable {
    public static void main(String[] args) {
        //static variables do not depend on object creation and thus can be accessed before them by using the class name
        System.out.println(Employee.company);

        //Creating few employees/objects
        Employee e1 = new Employee(101, "Raghav");
        Employee e2 = new Employee(102, "Manav");
        Employee e3 = new Employee(103, "Banni");
        e1.display();
        e2.display();
        e3.display();

        //If we create 'count' variable as non-static, then it will be re-initialized every time a new object is created, thus its value will be 1 every time we print count. Therefore, we make count as static so that its value will not be altered by a new object creation.
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        System.out.println("Total objects created: "+ Counter.count);
    }
}

class Employee {
    int empId;   //Instance variable(unique to every object)
    String name; //Instance variable(unique to every object)
    static String company = "Dhir Technologies"; //Static variable(Common for all company's employees) -> thus saves memory by creating only 1 common variable instead of creating same variable for every single object/employee, lets say for 1000's or lacs of employees.

    public Employee(int empId, String name) { //constructor
        this.empId = empId;
        this.name = name;
    }

    void display(){
        System.out.println(empId+", "+name+", "+company);
    }
}

//Another class 'Counter'
class Counter{
    //Shared class variable
    static int count = 0;

    //Constructor
    Counter(){
        count++;
    }
}
