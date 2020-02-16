package com.company.java.kyu6;

public class FindTheParityOutlier {
    static int find(int[] integers){
        int count = 0;
        for(int i =0; i<integers.length;i++){
            if(integers[i]%2!=0)
                count++;
        }
        for(int i =0; i<integers.length;i++){
            if(integers[i]%2==0 && count>1)
                return integers[i];
            if(integers[i]%2!=0 && count==1)
                return integers[i];
        }
        return 1;
    }
}
