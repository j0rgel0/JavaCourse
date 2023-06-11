package com.a1.datatype;
public class LongExample {
    public static void main(String[] args) {
        long number1 = 100;  // The compiler assumes integer literals by default
        System.out.println("number1: " + number1);  // Print the value of number1

        long number2 = 1234567890L;  // Explicitly declare a long using the L suffix
        System.out.println("number2: " + number2);  // Print the value of number2

        int intValue = 100;
        long longValue = intValue;  // Compiler automatically widens int to long
        System.out.println("longValue: " + longValue);  // Print the value of longValue

        int intValue2 = 2147483647;
        long longValue2 = intValue2;  // Compiler can widen int to long
        System.out.println("longValue2: " + longValue2);  // Print the value of longValue2

        long explicitLong = 9876543210L;  // Explicitly specify a long by suffixing the value with L
        System.out.println("explicitLong: " + explicitLong);  // Print the value of explicitLong
    }
}
