package ObjectOrientedProgramming;

public class Student {
    String name;
    int age;
    String address;

    //Constructor
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return ("Student's name is "+this.getName()+
                " ,age is "+this.getAge()+
                " ,address is "+this.getAddress());
    }

    public static void main(String[] args) {
        Student raghav = new Student("Raghav Dhir", 20, "Mohali");
        System.out.println(raghav.toString());
    }
}
