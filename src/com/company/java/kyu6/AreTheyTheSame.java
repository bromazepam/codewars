package com.company.java.kyu6;

import java.util.Arrays;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        int count=0;
        if(a==null || b==null) return false;
        if(a.length != b.length) return false;
        for(int i=0; i<b.length; ++i) {
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i =0; i< b.length;i++){
            if(a[i]==b[i]) count++;
        }
        if(count!=a.length) return false;
        return true;
    }
}
