package com.company.java.kyu6;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if(names.length == 1){
            return names[0]+" likes this";
        }
        if(names.length == 2){
            return names[0]+" and "+names[1]+" like this";
        }
        if(names.length == 3){
            return names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        if(names.length >= 4){
            int x=names.length-2;
            return names[0]+", "+names[1]+" and "+x+" others like this";
        } else
            return "no one likes this";
    }
}
