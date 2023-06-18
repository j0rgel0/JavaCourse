package com.java.datatypes;
public class ImplicitCastExample {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt; // Implicit cast from int to double

        System.out.println("Original int value: " + myInt);
        System.out.println("Widened double value: " + myDouble);
    }
}
