package com.company.java.kyu6;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int xor = 0;
        for(int i =0;i<a.length;i++)
            xor = xor ^ a[i];
        return xor;
    }
}

//
//public class FindOdd {
//    public static int findIt(int[] a) {
//        int count =0;
//        for(int i =0;i<a.length;i++){
//            for(int j = 0;j<a.length;j++){
//                if(a[i]==a[j])
//                    count++;
//            }
//            if(count%2!=0)
//                return a[i];
//        }
//        return -1;
//    }
//}