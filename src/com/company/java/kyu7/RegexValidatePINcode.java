package com.company.java.kyu7;

public class RegexValidatePINcode {
    public static boolean validatePin(String pin) {
        String regex = "[0-9]{4}|[0-9]{6}";
        return pin.matches(regex);
    }
}
