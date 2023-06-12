package com.a1.datatype.wrapper;

public class IntegerWrapperExample {
    public static void main(String[] args) {
        int intValue = 500;
        Integer intObj = Integer.valueOf(intValue);

        // intValue()
        int intPrimitive = intObj.intValue();
        System.out.println("Integer value as primitive: " + intPrimitive);

        // compareTo()
        Integer anotherIntObj = Integer.valueOf(200);
        int compareResult = intObj.compareTo(anotherIntObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = intObj.equals(anotherIntObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = intObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String intString = intObj.toString();
        System.out.println("String representation: " + intString);

        // parseInt()
        String intString2 = "1000";
        int parsedInt = Integer.parseInt(intString2);
        System.out.println("Parsed integer value: " + parsedInt);

        // valueOf(int)
        Integer intObj2 = Integer.valueOf(800);
        System.out.println("Integer object from int value: " + intObj2);

        // valueOf(String)
        String intString3 = "1200";
        Integer intObj3 = Integer.valueOf(intString3);
        System.out.println("Integer object from string value: " + intObj3);
    }
}