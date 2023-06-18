package com.section.a.datatype;

public class ExplicitCastExample {
    public static void main(String[] args) {
        double myDouble = 10.5;
        int myInt = (int) myDouble; // Explicit cast from double to int

        System.out.println("Original double value: " + myDouble);
        System.out.println("Narrowed int value: " + myInt);
    }
}
