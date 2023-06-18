package com.java.datatypes.wrapper;

public class ByteWrapperExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        Byte byteObj = Byte.valueOf(byteValue);

        // byteValue()
        byte bytePrimitive = byteObj.byteValue();
        System.out.println("Byte value as primitive: " + bytePrimitive);

        // compareTo()
        Byte anotherByteObj = Byte.valueOf((byte) 5);
        int compareResult = byteObj.compareTo(anotherByteObj);
        System.out.println("Comparison result: " + compareResult);

        // equals()
        boolean isEqual = byteObj.equals(anotherByteObj);
        System.out.println("Equality result: " + isEqual);

        // hashCode()
        int hashCode = byteObj.hashCode();
        System.out.println("Hash code: " + hashCode);

        // toString()
        String byteString = byteObj.toString();
        System.out.println("String representation: " + byteString);

        // parseByte()
        String byteString2 = "20";
        byte parsedByte = Byte.parseByte(byteString2);
        System.out.println("Parsed byte value: " + parsedByte);

        // valueOf(byte)
        Byte byteObj2 = Byte.valueOf((byte) 15);
        System.out.println("Byte object from byte value: " + byteObj2);

        // valueOf(String)
        String byteString3 = "25";
        Byte byteObj3 = Byte.valueOf(byteString3);
        System.out.println("Byte object from string value: " + byteObj3);
    }
}
