package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Box class object (Parent) accessing its own properties
        Box box = new Box(1,2,3);
        System.out.println(box.length+" "+box.width+" "+box.height);

        //BoxWeight class object (Child) accessing its own properties
        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.weight);

        //BoxWeight class object (Child) accessing parent's properties as well as its own properties using "super" keyword which refers to parent class's constructor having 3 parameters of length, width & height
        BoxWeight box2 = new BoxWeight(10,20,30,40);
        System.out.println(box2.length+" "+box2.width+" "+box2.height+" "+box2.weight+" ");
    }
}
