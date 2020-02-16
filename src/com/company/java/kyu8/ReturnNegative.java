package com.company.java.kyu8;

public class ReturnNegative {
    public static int makeNegative(final int x) {

        return (x < 0) ? x : -x;

    }

}

//        2.
//    public static int makeNegative(final int x) {
//
//        return -abs(x);
//    }
//        3.
//    public static int makeNegative(final int x) {
//        if (x>0) {
//            return 0-x;
//        } else if( x == 0) {
//            return 0;
//        } else {
//            return x;
//        }
//
//    }