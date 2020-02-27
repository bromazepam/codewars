package com.company.java.kyu6;

public class BuildAPileOfCubes {
    public static long findNb(long m) {
        long n = 0;
        long total = 0;
        while(total < m){
            n++;
            total +=(n*n*n);
        }
        return total == m ? n : -1;
    }
}
//cudnovato ponasanje '(n*n*n)' u drugim oblicima ex'n^3', 'math.pow(n,3)'
