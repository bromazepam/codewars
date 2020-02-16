package com.company.java.kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int length = word.length();
        int half = length/2;
        return (length % 2 !=0) ? String.valueOf(word.charAt(half)) : word.substring(half - 1, half + 1 );
    }
}

//drugo resenje

//    public static String getMiddle(String word) {
//        int p=0;
//        int l=0;
//        if(word.length() % 2 ==0){
//            p=word.length()/2-1;
//            l=2;
//            return word.substring(p,p+l);
//        } else {
//            p=word.length()/2;
//            l=1;
//            return word.substring(p,p+l);
//        }
//    }