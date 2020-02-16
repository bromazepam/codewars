package com.company.java.kyu6;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        String regex = "[(][0-9]{3}[)] [0-9]{3}-[0-9]{4}";
        return phoneNumber.matches(regex);
    }
}
