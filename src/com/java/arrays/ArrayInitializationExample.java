package com.java.arrays;

import java.util.Arrays;

public class ArrayInitializationExample {
    public static void main(String[] args) {
        // Inline Initialization
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        // Using the new Keyword
        int[] numbers2 = new int[5];
        String[] names2 = new String[3];

        // Initializing with Default Values
        int[] numbers3 = new int[5]; // Default values: 0, 0, 0, 0, 0
        boolean[] flags = new boolean[3]; // Default values: false, false, false

        // Initializing with Arrays.fill() Method
        int[] numbers4 = new int[5];
        Arrays.fill(numbers4, 42);

        // Initializing with System.arraycopy() Method
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, source.length);

        // Multi-Dimensional Array Initialization
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        char[][] grid = new char[3][3];

        // Print the arrays
        System.out.println("Inline Initialization:");
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("names: " + Arrays.toString(names));

        System.out.println("\nUsing the new Keyword:");
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("names2: " + Arrays.toString(names2));

        System.out.println("\nInitializing with Default Values:");
        System.out.println("numbers3: " + Arrays.toString(numbers3));
        System.out.println("flags: " + Arrays.toString(flags));

        System.out.println("\nInitializing with Arrays.fill() Method:");
        System.out.println("numbers4: " + Arrays.toString(numbers4));

        System.out.println("\nInitializing with System.arraycopy() Method:");
        System.out.println("source: " + Arrays.toString(source));
        System.out.println("destination: " + Arrays.toString(destination));

        System.out.println("\nMulti-Dimensional Array Initialization:");
        System.out.println("matrix: " + Arrays.deepToString(matrix));
        System.out.println("grid: " + Arrays.deepToString(grid));
    }
}
