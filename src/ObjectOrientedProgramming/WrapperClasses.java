package ObjectOrientedProgramming;

import javax.swing.text.html.HTMLDocument;

public class WrapperClasses {
    public static void main(String[] args) {
        //Primitive datatypes
        int primitiveInt = 5;
        double primitiveDouble = 10.5;
        char primitiveChar = 'c';
        boolean primitiveBoolean = true;

        //Wrapping primitives into their corresponding wrapper classes
        Integer wrappedInt = Integer.valueOf(primitiveInt);   //Boxing
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        //Displaying the value of wrapper objects
        System.out.println("Wrapped Integer: "+wrappedInt);
        System.out.println("Wrapped Double: "+wrappedDouble);
        System.out.println("Wrapped Character: "+wrappedChar);
        System.out.println("Wrapped Boolean: "+wrappedBoolean);

        //Unwrapping (Converting wrapper to primitive)
        int unwrappedInt = wrappedInt.intValue(); //Unboxing
        double unwrappedDouble = wrappedDouble.doubleValue();
        char unwrappedChar = wrappedChar.charValue();
        boolean unwrappedBoolean = wrappedBoolean.booleanValue();

        // Displaying the unwrapped primitive values
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Unwrapped Double: " + unwrappedDouble);
        System.out.println("Unwrapped Character: " + unwrappedChar);
        System.out.println("Unwrapped Boolean: " + unwrappedBoolean);
    }
}

//Boxing: Converting a primitive into a wrapper object using methods like Integer.valueOf().
//Unboxing: Extracting the primitive value from a wrapper object using methods like intValue().
