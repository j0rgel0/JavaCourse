package com.java.datatypes.wrapper;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive type to corresponding wrapper class object
        int primitiveInt = 42;
        Integer wrapperInt = primitiveInt;
        System.out.println("Autoboxing: " + wrapperInt);

        // Unboxing: Converting wrapper class object to primitive type
        Double wrapperDouble = 3.14;
        double primitiveDouble = wrapperDouble;
        System.out.println("Unboxing: " + primitiveDouble);

        // Autoboxing in expressions
        Integer num1 = 10; // Autoboxing
        Integer num2 = 20; // Autoboxing
        Integer sum = num1 + num2; // Unboxing, addition, and autoboxing
        System.out.println("Autoboxing in expressions: " + sum);

        // Unboxing in expressions
        Integer wrapperNum1 = 5; // Autoboxing
        int primitiveNum1 = wrapperNum1; // Unboxing
        int result = primitiveNum1 * 2; // Multiplication using primitive value
        System.out.println("Unboxing in expressions: " + result);
    }
}
