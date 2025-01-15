package ObjectOrientedProgramming;

public class InnerClasses { //Outer classes cannot be static because they are not dependent on any classes themselves.

    static class Test{ //But these inner classes can be static or non -static because they depend on the outer classes. If they are not static, the object of outer class must be needed to create their object in the main method. But as this class is now static, the object of outer class is not needed to create the object of inner class.
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Raghav");
        Test b = new Test("Manav");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
