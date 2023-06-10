// Classes are the basic building blocks of Java programs.
// When defining a class, you describe its parts and characteristics.

// Package Names. It prevents naming collisions and access protection.
// - Package names should be written in lowercase letters.
// - Package names should be a series of words separated by periods (e.g., com.example.package).
// - Package names should be unique and follow the reverse domain name convention to avoid naming conflicts.
package com.a1.firststeps;

// Class Names:
// - Class names should be written in CamelCase.
// - The first letter of the class name should be capitalized.
// - If the class name consists of multiple words, capitalize the first letter of each word (e.g., ClassName).
// - Class names should be descriptive and meaningful, representing the purpose or nature of the class.
public class HelloWorld {

    // Fields (Variables). Fields store program state and represent the components of a class.
    // Declare and define variables to store data that the class needs.
    // Field names should be written in camelCase. The first letter of the field name should be lowercase.
    // If the field name consists of multiple words, capitalize the first letter of each word except the first one.
    // Field names should be descriptive and indicate the purpose or nature of the field.

    // For example, we can declare a field called "counter" to store a count value.
    private int counter;

    // Methods (Functions/Procedures). Methods perform operations on program state and represent the behavior of a class.
    // Implement functionality by writing code inside methods.
    // Method names should be written in camelCase. The first letter of the method name should be lowercase.
    // If the method name consists of multiple words, capitalize the first letter of each word except the first one.
    // Method names should be descriptive and indicate the action performed by the method.

    // For example, we can define a method called "incrementCounter" to increase the value of the counter field.
    public void incrementCounter() {
        counter++;
    }
    public void printHelloWorld() {
        System.out.println("Hello, World!"); // Print "Hello, World!" to the console
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld(); // Create an instance of the HelloWorld class
        hello.printHelloWorld(); // Call the printHelloWorld method, which prints "Hello, World!"
        hello.incrementCounter(); // Call the incrementCounter method, which increments the value of counter
        System.out.println("Counter value: " + hello.counter); // Print the value of counter to the console
    }
}
