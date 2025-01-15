package ObjectOrientedProgramming;

public class StaticExecutionFlow {
    static int staticVar = 100;
    int instanceVar;
    static{
        System.out.println("Static block executed: Initializing staticVar.");
        staticVar = 200;
    }
    StaticExecutionFlow(int value) {
        System.out.println("Constructor executed: Setting instanceVar.");
        this.instanceVar = value;
    }
    static void staticMethod() {
        System.out.println("Static method called: staticVar = "+ staticVar);
    }
    void instanceMethod(){
        System.out.println("Instance Method called: instanceVar = "+instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("Starting program execution...");
        System.out.println("Accessing staticVar: "+StaticExecutionFlow.staticVar);
        StaticExecutionFlow.staticMethod();
        StaticExecutionFlow obj1 = new StaticExecutionFlow(10);
        obj1.instanceMethod();
        StaticExecutionFlow obj2 = new StaticExecutionFlow(20);
        obj2.instanceMethod();
        System.out.println("Accessing staticVar after creating objects: "+ StaticExecutionFlow.staticVar);
        StaticExecutionFlow.staticMethod();
    }
}
