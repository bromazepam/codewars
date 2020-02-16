package com.company.java.kyu7;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}


//    public static boolean solution(String str, String ending) {
//        int l = ending.length();
//        int l2 = str.length();
//        if(l>l2){
//            return false;
//        }
//        String s = str.substring(l2-l, l2);
//        if(s.equals(ending)){
//            return true;
//        } else {
//            return false;
//        }
//    }