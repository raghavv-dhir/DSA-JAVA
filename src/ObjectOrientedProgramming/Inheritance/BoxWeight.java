package ObjectOrientedProgramming.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight= -1;
    }

    BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }
}
