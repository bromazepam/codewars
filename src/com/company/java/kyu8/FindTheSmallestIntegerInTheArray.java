package com.company.java.kyu8;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int temp=0;
        for(int i=0;i<=args.length;i++){
            for(int j=i+1;j<args.length;j++){
                if(args[i]>args[j]){
                    temp=args[i];
                    args[i]=args[j];
                    args[j]=temp;
                }
            }
        }
        return args[0];
    }
}
