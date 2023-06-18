package com.section.a.datatype.wrapper;

public class DoubleWrapperClass {
    public static void main(String[] args) {
        double doubleValue = 3.14159;
        Double doubleObj = Double.valueOf(doubleValue);

        // doubleValue()
        double doublePrimitive = doubleObj.doubleValue();
        System.out.println("Double value as primitive: " + doublePrimitive);

        // compareTo()
        Double anotherDoubleObj = Double.valueOf(2.71828);
        int compareResult = doubleObj.compareTo(anotherDoubleObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = doubleObj.equals(anotherDoubleObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = doubleObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String doubleString = doubleObj.toString();
        System.out.println("String representation: " + doubleString);

        // parseDouble()
        String doubleString2 = "2.5";
        double parsedDouble = Double.parseDouble(doubleString2);
        System.out.println("Parsed double value: " + parsedDouble);

        // valueOf(double)
        Double doubleObj2 = Double.valueOf(1.61803);
        System.out.println("Double object from double value: " + doubleObj2);

        // valueOf(String)
        String doubleString3 = "4.2";
        Double doubleObj3 = Double.valueOf(doubleString3);
        System.out.println("Double object from string value: " + doubleObj3);
    }
}
