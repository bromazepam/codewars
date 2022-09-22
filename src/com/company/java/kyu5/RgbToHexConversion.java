package com.company.java.kyu5;

/**
 * The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal
 * representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range
 * must be rounded to the closest valid value.
 * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
 * The following are examples of expected output values:
 * <p>
 * RgbToHex.rgb(255, 255, 255) // returns FFFFFF
 * RgbToHex.rgb(255, 255, 300) // returns FFFFFF
 * RgbToHex.rgb(0, 0, 0)       // returns 000000
 * RgbToHex.rgb(148, 0, 211)   // returns 9400D3
 */

public class RgbToHexConversion {
    public static String rgb(int r, int g, int b) {
        String result = "";
        result = getHexString(r, result);
        result = getHexString(g, result);
        result = getHexString(b, result);

        return result;
    }

    private static String getHexString(int r, String result) {
        if (r >= 0 && r <= 255) {
            int f1 = r / 16;
            int f2 = r - (f1 * 16);
            result += convert(f1);
            result += convert(f2);
        } else if (r < 0) {
            result += "00";
        } else {
            result += "FF";
        }
        return result;
    }

    public static String convert(int n) {
        String result = "";
        switch (n) {
            case 15 -> result += "F";
            case 14 -> result += "E";
            case 13 -> result += "D";
            case 12 -> result += "C";
            case 11 -> result += "B";
            case 10 -> result += "A";
            default -> result += String.valueOf(n);
        }
        return result;
    }
}
