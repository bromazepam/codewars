package com.company.java.kyu6;

public class SplitStrings {
    public static String[] solution(String s) {
        if (s.length()
                % 2 != 0) s += "_";
        return s.split("(?<=\\G.{2})");
    }
}
//ex "abcdef" split into "ab, cd, ef"
//"abcde" split into "ab, cd, e_"
