package com.section.a.datatype;

import java.util.stream.*;

public class WrapperClassExample {
    public static void main(String[] args) {
        printBooleanValues();
        printByteValues();
        printShortValues();
        printIntegerValues();
        printLongValues();
        printFloatValues();
        printDoubleValues();
        printCharacterValues();
    }

    private static void printBooleanValues() {
        System.out.println("Boolean Values:");
        Boolean booleanObj = true;
        System.out.println("- Boolean value: " + booleanObj);
        System.out.println("- Autoboxed boolean value: " + booleanObj.booleanValue());
        System.out.println("- First boolean value from the stream: " + Stream.of(booleanObj).findFirst().get());
        System.out.println();
    }

    private static void printByteValues() {
        System.out.println("Byte Values:");
        Byte byteObj = 10;
        System.out.println("- Byte value: " + byteObj);
        System.out.println("- Byte value after using valueOf(): " + Byte.valueOf((byte) 10));
        System.out.println("- Autoboxed byte value: " + byteObj.byteValue());
        System.out.println("- Byte value after parsing string: " + Byte.parseByte("10"));
        System.out.println("- Byte value after decoding string: " + Byte.decode("0xA"));
        System.out.println("- First byte value from the stream: " + Stream.of(byteObj).findFirst().get());
        System.out.println();
    }

    private static void printShortValues() {
        System.out.println("Short Values:");
        Short shortObj = 100;
        System.out.println("- Short value: " + shortObj);
        System.out.println("- Short value after using valueOf(): " + Short.valueOf((short) 100));
        System.out.println("- Autoboxed short value: " + shortObj.shortValue());
        System.out.println("- Short value after parsing string: " + Short.parseShort("100"));
        System.out.println("- Short value after decoding string: " + Short.decode("0x64"));
        System.out.println("- First short value from the stream: " + Stream.of(shortObj).findFirst().get());
        System.out.println();
    }

    private static void printIntegerValues() {
        System.out.println("Integer Values:");
        Integer integerObj = 1000;
        System.out.println("- Integer value: " + integerObj);
        System.out.println("- Integer value after using valueOf(): " + Integer.valueOf(1000));
        System.out.println("- Autoboxed int value: " + integerObj.intValue());
        System.out.println("- Integer value after parsing string: " + Integer.parseInt("1000"));
        System.out.println("- Integer value after decoding string: " + Integer.decode("0x3E8"));
        System.out.println("- First int value from the stream: " + Stream.of(integerObj).findFirst().get());
        System.out.println();
    }

    private static void printLongValues() {
        System.out.println("Long Values:");
        Long longObj = 100000L;
        System.out.println("- Long value: " + longObj);
        System.out.println("- Long value after using valueOf(): " + Long.valueOf(100000L));
        System.out.println("- Autoboxed long value: " + longObj.longValue());
        System.out.println("- Long value after parsing string: " + Long.parseLong("100000"));
        System.out.println("- Long value after decoding string: " + Long.decode("0x186A0"));
        System.out.println("- First long value from the stream: " + Stream.of(longObj).findFirst().get());
        System.out.println();
    }

    private static void printFloatValues() {
        System.out.println("Float Values:");
        Float floatObj = 3.14f;
        System.out.println("- Float value: " + floatObj);
        System.out.println("- Float value after using valueOf(): " + Float.valueOf(3.14f));
        System.out.println("- Autoboxed float value: " + floatObj.floatValue());
        System.out.println("- Float value after parsing string: " + Float.parseFloat("3.14f"));
        System.out.println();
    }

    private static void printDoubleValues() {
        System.out.println("Double Values:");
        Double doubleObj = 3.14159;
        System.out.println("- Double value: " + doubleObj);
        System.out.println("- Double value after using valueOf(): " + Double.valueOf(3.14159));
        System.out.println("- Autoboxed double value: " + doubleObj.doubleValue());
        System.out.println("- Double value after parsing string: " + Double.parseDouble("3.14159"));
        System.out.println();
    }

    private static void printCharacterValues() {
        System.out.println("Character Values:");
        Character charObj = 'A';
        System.out.println("- Character value: " + charObj);
        System.out.println("- Character value after using valueOf(): " + Character.valueOf('A'));
        System.out.println("- Autoboxed char value: " + charObj.charValue());
        System.out.println("- First char value from the stream: " + (char) Stream.of(charObj).mapToInt(c -> c).findFirst().orElseThrow());
        System.out.println();
    }

}
