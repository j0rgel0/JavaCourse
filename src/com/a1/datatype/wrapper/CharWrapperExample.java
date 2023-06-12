package com.a1.datatype.wrapper;

public class CharWrapperExample {
    public static void main(String[] args) {
        char charValue = 'A';
        Character charObj = Character.valueOf(charValue);

        // charValue()
        char charPrimitive = charObj.charValue();
        System.out.println("Character value as primitive: " + charPrimitive);

        // compareTo()
        Character anotherCharObj = Character.valueOf('B');
        int compareResult = charObj.compareTo(anotherCharObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = charObj.equals(anotherCharObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = charObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String charString = charObj.toString();
        System.out.println("String representation: " + charString);

        // isLetter()
        char charValue2 = '3';
        boolean isLetter = Character.isLetter(charValue2);
        System.out.println(charValue2 + " is a letter: " + isLetter);

        // isDigit()
        boolean isDigit = Character.isDigit(charValue2);
        System.out.println(charValue2 + " is a digit: " + isDigit);

        // isWhitespace()
        char charValue3 = ' ';
        boolean isWhitespace = Character.isWhitespace(charValue3);
        System.out.println(charValue3 + " is whitespace: " + isWhitespace);

        // toUpperCase()
        char upperChar = Character.toUpperCase(charValue);
        System.out.println("Uppercase of " + charValue + ": " + upperChar);

        // toLowerCase()
        char lowerChar = Character.toLowerCase(charValue);
        System.out.println("Lowercase of " + charValue + ": " + lowerChar);
    }
}
