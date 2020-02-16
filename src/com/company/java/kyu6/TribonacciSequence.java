package com.company.java.kyu6;

public class TribonacciSequence {
    public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        if(n==0) return result;
        for(int i =0;i<s.length && i<n;i++){
            result[i] = s[i];
        }
        for(int i=s.length;i<n;i++){
            result[i]=result[i-1]+result[i-2]+result[i-3];
        }
        return result;
    }
}
