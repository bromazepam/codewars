package com.company.java.kyu5;

/**
 * Complete the function scramble(str1, str2) that returns true if a portion of
 * str1 characters can be rearranged to match str2, otherwise returns false.
 *
 * Notes:
 *     Only lower case letters will be used (a-z). No punctuation or digits will be included.
 *     Performance needs to be considered
 */

public class Scramblines {
    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        for (String s : str2.split("")) {
            if (!str1.contains(s)) {
                return false;
            }
            str1 = str1.replaceFirst(s, "");
        }
        return true;
    }
}
