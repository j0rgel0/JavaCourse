package com.a1.datatype;

public class InfinityNaNExample {
    public static void main(String[] args) {
        double infinity = Double.POSITIVE_INFINITY;  // Declare a variable with the value of positive infinity
        double nan = Double.NaN;  // Declare a variable with the value of NaN (Not-a-Number)

        // Check if the infinity value is infinite
        if (Double.isInfinite(infinity)) {
            System.out.println("The value is infinite");
        } else {
            System.out.println("The value is not infinite");
        }

        // Check if the nan value is NaN
        if (Double.isNaN(nan)) {
            System.out.println("The value is NaN");
        } else {
            System.out.println("The value is not NaN");
        }
    }
}
