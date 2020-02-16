package com.company.java.kyu6;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array){
        int missingLetterAscii = 0;
        for(int i=0;i<array.length-1;i++){
            if((int)array[i]!=(int)array[i+1]-1){
                missingLetterAscii = (int)array[i]+1;
            }
        }
        return (char) missingLetterAscii;
    }
}
