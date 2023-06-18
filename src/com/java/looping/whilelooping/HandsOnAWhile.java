package com.java.looping.whilelooping;
import java.util.Scanner;
public class HandsOnAWhile {
    public static void main(String[] args) {
        // Instructions: Ask the user to enter a password and keep asking until a valid password is entered
        Scanner scanner = new Scanner(System.in);
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            /*   The password must have a length of at least 8 characters.
                It must contain at least one uppercase letter.
                It must contain at least one lowercase letter.
                It must contain at least one digit (0-9).
            */
            if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*")) {
                isValidPassword = true;
            } else {
                System.out.println("Invalid password! Try again.");
            }
        }

        System.out.println("Password accepted!");

    }
}
