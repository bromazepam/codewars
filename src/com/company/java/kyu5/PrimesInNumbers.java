package com.company.java.kyu5;

import java.util.ArrayList;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
 *
 * "(p1**n1)(p2**n2)...(pk**nk)"
 *
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 *
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */

public class PrimesInNumbers {
    public static String factors(int n) {
        final StringBuilder builder = new StringBuilder();
        int counter = 1;

        ArrayList arr = new ArrayList();
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                arr.add(i);
                n = n / i;
            }
        }
        arr.add(n);

        for (int j = 0; j < arr.size() - 1; j++) {
            if (arr.get(j) == arr.get(j + 1)) {
                counter++;
            } else {
                if (counter == 1) {
                    builder.append('(').append(arr.get(j)).append(')');
                } else {
                    builder.append('(').append(arr.get(j)).append("**").append(counter).append(')');
                }
                counter = 1;
            }

        }
        builder.append('(').append(n).append(')');
        return builder.toString();
    }
}


//alt
//        String result = "";
//        for (int fac = 2; fac <= lst; ++fac) {
//        int count;
//        for (count = 0; lst % fac == 0; ++count) {
//        lst /= fac;
//        }
//        if (count > 0) {
//        result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
//        }
//        }
//        return result;