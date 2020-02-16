package com.company.java.kyu6;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        for(int i =0;i<array.length;i++){
            if(array[i]%2!=0){
                for(int j=i;j<array.length;j++){
                    if(array[j]%2!=0){
                        if(array[i]>array[j]){
                            int temp=array[j];
                            array[j]=array[i];
                            array[i]=temp;
                        }
                    }
                }
            }
        }
        return array;
    }
}
