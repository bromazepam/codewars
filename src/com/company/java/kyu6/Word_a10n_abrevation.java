package com.company.java.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word_a10n_abrevation {
    public String abbreviate(String string) {
        Pattern p = Pattern.compile("([a-zA-Z]{4,})");
        Matcher m = p.matcher(string);

        while (m.find()) {
            String target = m.group();
            String abbr = "" + target.charAt(0) + (target.length() - 2) + target.charAt(target.length() - 1);
            System.out.println(abbr);
            string = string.replaceFirst(target, abbr);
        }

        return string;
    }
}

// other solution
//public class Abbreviator {
//
//    public String abbreviate(String s) {
//        String[] words = s.split("[^a-zA-Z]+");
//        String[] separators = s.split("[a-zA-Z]+");
//        String result = "";
//
//        int i = 1;
//        for (String word : words) {
//            result += processWord(word);
//            if (i < separators.length) {
//                result += separators[i++];
//            }
//        }
//        return result;
//    }
//
//    private String processWord(String word) {
//        if (word.length() < 4) return word;
//        int n = word.length() - 2;
//        return "" + word.charAt(0) + n + word.charAt(word.length() - 1);
//    }
//}