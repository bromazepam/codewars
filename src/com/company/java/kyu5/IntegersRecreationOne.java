package com.company.java.kyu5;

import java.util.Arrays;
import java.util.Vector;

//sum squared divisors
public class IntegersRecreationOne {
    public static String listSquared(long m, long n) {
        Vector result = new Vector();
        for(long i=m;i<=n;i++){
            Vector sum = new Vector();
            for(long j =1;j<=m;j++){
                if(m%j==0){
                    sum.addElement(j*j);
                }
            }
            long s = 0;
            for(int j=0;j<sum.size();j++){
                s = s + (long)sum.get(j);
            }
            if(Math.sqrt(s)%1==0){
                long[] item = new long[]{m,s};
                result.addElement(Arrays.toString(item));
            }
            m++;
        }
        return Arrays.toString(result.toArray());
    }
}
