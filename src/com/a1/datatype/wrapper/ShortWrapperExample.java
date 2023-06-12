package com.a1.datatype.wrapper;

public class ShortWrapperExample {
    public static void main(String[] args) {
        short shortValue = 100;
        Short shortObj = Short.valueOf(shortValue);

        // shortValue()
        short shortPrimitive = shortObj.shortValue();
        System.out.println("Short value as primitive: " + shortPrimitive);

        // compareTo()
        Short anotherShortObj = Short.valueOf((short) 50);
        int compareResult = shortObj.compareTo(anotherShortObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = shortObj.equals(anotherShortObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = shortObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String shortString = shortObj.toString();
        System.out.println("String representation: " + shortString);

        // parseShort()
        String shortString2 = "200";
        short parsedShort = Short.parseShort(shortString2);
        System.out.println("Parsed short value: " + parsedShort);

        // valueOf(short)
        Short shortObj2 = Short.valueOf((short) 150);
        System.out.println("Short object from short value: " + shortObj2);

        // valueOf(String)
        String shortString3 = "250";
        Short shortObj3 = Short.valueOf(shortString3);
        System.out.println("Short object from string value: " + shortObj3);
    }
}