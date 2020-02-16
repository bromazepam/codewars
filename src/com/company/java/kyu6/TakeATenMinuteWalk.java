package com.company.java.kyu6;

public class TakeATenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int n=0, s=0, w=0, e =0;
        if(walk.length == 10){
            for(int i =0; i<10;i++){
                if(walk[i]=='n') n++;
                if(walk[i]=='s') s++;
                if(walk[i]=='w') w++;
                if(walk[i]=='e') e++;
            }
            return (n==s && w==e) ? true : false;
        }
        return false;
    }
}
