package com.codewars.java.easiest.fundamentals;

public class Kata1 {

    static final int HEX_RADIX = 16;

    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, HEX_RADIX);
    }
}
