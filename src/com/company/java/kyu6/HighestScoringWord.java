package com.company.java.kyu6;

public class HighestScoringWord {
    public static String high(String s) {
//   int temp = 0;
        int max = 0;
        String t = "";
        String[] str = s.split(" ");
        for(String word: str){
            char[] temp = word.toCharArray();
            int sum = 0;
            for (int j = 0; j < temp.length; j++) {
                sum += (int) temp[j] - 96;
            }
            if (sum > max) {
                t = word;
                max=sum;
            }
        }
        return t;
    }
}
