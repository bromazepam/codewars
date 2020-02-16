package com.company.java.kyu4;

public class SquareIntoSquares_ProtectTrees {
    public String decompose(long n) {
        String result = null;
        for (long i = n - 1; i > 1; i--) {
            long square = n * n;
            result = recurseDecompose(i, square);
//             System.out.println(result);
            if (result != null) break;
        }
        return result;
    }

    public static String recurseDecompose(long i, long rem) {
        if (i * i == rem) {
//             System.out.println( i);
            return i + "";
        } else if (i * i < rem) {
            rem = rem - i * i;

            for (long j = i - 1; j > 0; j--) {
                String tmp = recurseDecompose(j, rem);

                if (tmp != null) {
//                     System.out.println(tmp + " " + i);
                    return tmp + " " + i;
                } else {
                    continue;
                }
            }
        } else {
            return null;
        }

        return null;
    }
}