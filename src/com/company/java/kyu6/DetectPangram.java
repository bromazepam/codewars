package com.company.java.kyu6;

public class DetectPangram {
    public boolean check(String sentence){
        for( char c = 'a'; c<='z'; c++){
            if(!sentence.toLowerCase().contains(""+ c))
                return false;
        }
        return true;
    }
}


//    public boolean check(String sentence){
//        String sen = sentence.toUpperCase();
//        boolean[] a = new boolean[26];
//        int index = 0;
//        int counter = 0;
//        for(int i =0;i<sen.length();i++){
//            if('A'<=sen.charAt(i) && sen.charAt(i) <= 'Z'){
//                index = sen.charAt(i) - 'A';
//                a[index] = true;
//            }
//        }
//        for(int i =0;i<26;i++){
//            if(a[i] == true){
//                counter++;
//            }
//        }
//        if(counter == 26){
//            return true ;
//        }else{
//            return false;
//        }
//    }