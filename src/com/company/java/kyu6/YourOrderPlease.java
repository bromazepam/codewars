package com.company.java.kyu6;

public class YourOrderPlease {
    public static String order(String words) {
        if( words == null)
            return "";
        String[] wordArray = words.split(" ");
        String output="";
        for(int i =0; i<10;i++)
            for(String str: wordArray)
                if(str.contains(Integer.toString(i)))
                    output += str+" ";
        return output.trim();
    }
}
