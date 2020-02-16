package com.company.java.kyu7;

public class Isograms {
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        for(int i =0; i< str.length();i++){
            for(int j =i+1;j<str.length();j++){
                if(arr[i]==arr[j])
                    return false;
            }
        }
        return true;
    }
}
