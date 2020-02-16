package com.company.java.kyu7;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int count =0;
        int sq =0;
        for(int i=0;i<=n;i++){
            sq=i*i;
            if(sq==0 && d==0)
                count++;
            while(sq > 0)
            {
                if(sq % 10 == d)
                    count++;
                sq=sq/10;
            }
        }
        return count;
    }
}
