package com.company.java.kyu8;

public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {

        int d = str.length();

        return str.substring(1, d-1);
    }
}
