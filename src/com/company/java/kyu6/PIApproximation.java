package com.company.java.kyu6;

import java.text.DecimalFormat;

public class PIApproximation {
    public static String iterPi2String(Double epsilon) {
        DecimalFormat df = new DecimalFormat("#.##########");
        String res = null;
        int count = 1, i = 1, sign = -1;
        double sum=1.0;
        do{
            sum+=(double)(sign)/(2*i+1);
            i++;
            count++;
            sign=-sign;
        }while(Math.abs((4*sum)-Math.PI)>=epsilon);
        sum=4*sum;
        res="["+count+", "+df.format(sum)+"]";
        return res;
    }
}
