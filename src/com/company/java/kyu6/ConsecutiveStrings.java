package com.company.java.kyu6;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length==0 || k>strarr.length || k<=0)
            return "";
        String longest = "", temp = "";
        for(int i=0;i<=strarr.length-k;i++){
            for(int j=i;j<i+k;j++){
                temp +=strarr[j];
                if(temp.length()>longest.length())
                    longest=temp;
            }
            temp="";
        }
        return longest;
    }
}
