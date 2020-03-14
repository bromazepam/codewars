package com.company.java.kyu6;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String textLower = text.toLowerCase();
        Set<Character> uniqueRepeats = new HashSet<>();
        for (int i = 0; i < textLower.length() - 1; i ++) {
            char character = textLower.charAt(i);
            if (!uniqueRepeats.contains(character) && textLower.indexOf(character, i + 1) != -1) {
                uniqueRepeats.add(character);
            }
        }
        return uniqueRepeats.size();
    }
}