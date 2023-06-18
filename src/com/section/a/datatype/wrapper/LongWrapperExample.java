package com.section.a.datatype.wrapper;

public class LongWrapperExample {
    public static void main(String[] args) {
        long longValue = 1000000L;
        Long longObj = Long.valueOf(longValue);

        // longValue()
        long longPrimitive = longObj.longValue();
        System.out.println("Long value as primitive: " + longPrimitive);

        // compareTo()
        Long anotherLongObj = Long.valueOf(500000L);
        int compareResult = longObj.compareTo(anotherLongObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = longObj.equals(anotherLongObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = longObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String longString = longObj.toString();
        System.out.println("String representation: " + longString);

        // parseLong()
        String longString2 = "2000000";
        long parsedLong = Long.parseLong(longString2);
        System.out.println("Parsed long value: " + parsedLong);

        // valueOf(long)
        Long longObj2 = Long.valueOf(1500000L);
        System.out.println("Long object from long value: " + longObj2);

        // valueOf(String)
        String longString3 = "2500000";
        Long longObj3 = Long.valueOf(longString3);
        System.out.println("Long object from string value: " + longObj3);
    }
}