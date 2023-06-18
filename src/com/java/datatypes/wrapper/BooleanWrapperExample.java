package com.java.datatypes.wrapper;

public class BooleanWrapperExample {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);

        // booleanValue()
        boolean boolPrimitive = Boolean.valueOf(bool1).booleanValue();
        System.out.println("Boolean value of bool1 as primitive: " + boolPrimitive);

        // compareTo()
        Boolean boolObj1 = Boolean.valueOf(bool1);
        Boolean boolObj2 = Boolean.valueOf(bool2);
        System.out.println("boolObj1: " + boolObj1);
        System.out.println("boolObj2: " + boolObj2);

        int compareResult = boolObj1.compareTo(boolObj2);
        System.out.println("Comparison result of boolObj1 and boolObj2: " + compareResult);

        // equals()
        boolean isEqual = boolObj1.equals(boolObj2);
        System.out.println("Equality result of boolObj1 and boolObj2: " + isEqual);

        // hashCode()
        int hashCode = boolObj1.hashCode();
        System.out.println("Hash code of boolObj1: " + hashCode);

        // toString()
        String boolString = boolObj1.toString();
        System.out.println("String representation of boolObj1: " + boolString);

        // parseBoolean()
        String boolString2 = "false";
        boolean parsedBool = Boolean.parseBoolean(boolString2);
        System.out.println("Parsed boolean value from boolString2: " + parsedBool);

        // valueOf(boolean)
        Boolean boolObj3 = Boolean.valueOf(bool2);
        System.out.println("Boolean object created from bool2: " + boolObj3);

        // valueOf(String)
        String boolString3 = "true";
        Boolean boolObj4 = Boolean.valueOf(boolString3);
        System.out.println("Boolean object created from boolString3: " + boolObj4);

        // getBoolean()
        String propertyName = "java.home";
        boolean systemProperty = Boolean.getBoolean(propertyName);
        System.out.println("System property value for propertyName: " + systemProperty);

        // compare()
        int compareResult2 = Boolean.compare(bool1, bool2);
        System.out.println("Comparison result of bool1 and bool2: " + compareResult2);
    }
}