package ObjectOrientedProgramming;

public class GarbageCollection {
    public static void main(String[] args) {
        //Creating objects
        GarbageDemo obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new GarbageDemo("Object "+ i);
        }
    }
}

// A class to represent an object that can be garbage collected
class GarbageDemo{
    private String name;

    // Constructor to initialize the object
    GarbageDemo(String name){
        this.name = name;
        System.out.println(name+" created.");
    }

    // Finalize method called before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }
}
