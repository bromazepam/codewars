package com.company.java.kyu7;

import java.util.stream.*;

public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();

    }
}


//    public static int findShort(String s) {
//        String[] word = s.split(" ");
//        int shortest = Integer.MAX_VALUE;
//        for(int i =0; i<word.length; i++){
//            String w = word[i];
//            int length = w.length();
//            if( length< shortest)
//                shortest = length;
//        }
//        return shortest;
//    }