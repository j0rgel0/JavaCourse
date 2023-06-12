package com.a1.datatype.wrapper;

public class FloatWrapperClass {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        Float floatObj = Float.valueOf(floatValue);

        // floatValue()
        float floatPrimitive = floatObj.floatValue();
        System.out.println("Float value as primitive: " + floatPrimitive);

        // compareTo()
        Float anotherFloatObj = Float.valueOf(2.5f);
        int compareResult = floatObj.compareTo(anotherFloatObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = floatObj.equals(anotherFloatObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = floatObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String floatString = floatObj.toString();
        System.out.println("String representation: " + floatString);

        // parseFloat()
        String floatString2 = "3.5";
        float parsedFloat = Float.parseFloat(floatString2);
        System.out.println("Parsed float value: " + parsedFloat);

        // valueOf(float)
        Float floatObj2 = Float.valueOf(2.8f);
        System.out.println("Float object from float value: " + floatObj2);

        // valueOf(String)
        String floatString3 = "4.2";
        Float floatObj3 = Float.valueOf(floatString3);
        System.out.println("Float object from string value: " + floatObj3);
    }
}
