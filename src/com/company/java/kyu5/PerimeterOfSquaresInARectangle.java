package com.company.java.kyu5;

import java.math.BigInteger;

/**
 * The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of
 * the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
 *
 * Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in
 * the same manner as in the drawing:
 *
 * alternative text
 * Hint:
 *      See Fibonacci sequence
 *      Ref:
 *      http://oeis.org/A000045
 * The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and
 * returns the total perimeter of all the squares.
 *
 * perimeter(5)  should return 80
 * perimeter(7)  should return 216
 */

public class PerimeterOfSquaresInARectangle {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("1");
        BigInteger n3;
        BigInteger sum = new BigInteger("0");
        BigInteger m = new BigInteger("4");
        for (BigInteger bi = BigInteger.valueOf(1);
             bi.compareTo(n) <= 0;
             bi = bi.add(BigInteger.ONE)) {
            n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
            sum = sum.add(n3);
        }
        return m.multiply(sum.add(BigInteger.valueOf(1)));
    }
}
