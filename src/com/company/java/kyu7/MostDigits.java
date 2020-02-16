package com.company.java.kyu7;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int index = 0;
        for(int i=0;i<numbers.length;i++){
            if(String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()){
                index = i;
            }
        }
        return numbers[index];
    }
}

//
//    public static int findLongest(int[] numbers) {
//        for(int i =1; i<numbers.length;i++){
//            int l1 = String.valueOf(Math.abs(numbers[0])).length();
//            int l2 = String.valueOf(Math.abs(numbers[i])).length();
//            int s = 0;
//            if(l1<l2){
//                s=l1;
//                numbers[0]=numbers[i];
//                numbers[i]=s;
//            }
//        }
//        return numbers[0];
//    }