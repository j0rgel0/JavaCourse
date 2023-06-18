package com.java.basics;

public class CaseSensitiveExamples {
    // Fields with different case sensitivity
    private int myVariable;      // Field in lowercase
    private int myvariable;      // Field with mixed case
    private int MYVARIABLE;      // Field with all uppercase

    // Method in lowercase
    public void myMethod() {
        System.out.println("This is myMethod.");
    }

    // Method with the first letter capitalized
    public void MyMethod() {
        System.out.println("This is MyMethod.");
    }

    // Method with all letters capitalized
    public void MYMETHOD() {
        System.out.println("This is MYMETHOD.");
    }

    public static void main(String[] args) {
        CaseSensitiveExamples example = new CaseSensitiveExamples();

        // Assign values to fields with different case sensitivity
        example.myVariable = 10;
        example.myvariable = 20;
        example.MYVARIABLE = 30;

        // Print the values of the fields
        System.out.println("myVariable value: " + example.myVariable);
        System.out.println("myvariable value: " + example.myvariable);
        System.out.println("MYVARIABLE value: " + example.MYVARIABLE);

        // Call the methods with different case sensitivity
        example.myMethod();   // Call the myMethod() in lowercase
        example.MyMethod();   // Call the MyMethod() with the first letter capitalized
        example.MYMETHOD();   // Call the MYMETHOD() with all letters capitalized
    }
}