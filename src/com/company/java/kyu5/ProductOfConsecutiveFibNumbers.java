package com.company.java.kyu5;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence (Fn):
 *     0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
 * such as
 *     F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
 * Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
 *     F(n) * F(n+1) = prod.
 * Your function productFib takes an integer (prod) and returns an array:
 * [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
 * depending on the language if F(n) * F(n+1) = prod.
 * If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prodyou will return
 * [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
 *
 * F(n) being the smallest one such as F(n) * F(n+1) > prod.
 * Some Examples of Return:
 *
 * productFib(714) # should return (21, 34, true),
 *                 # since F(8) = 21, F(9) = 34 and 714 = 21 * 34
 */

public class ProductOfConsecutiveFibNumbers {
    public static long[] productFib(long prod) {
        long num1 = 0;
        long num2 = 1;
        long mul = num1 * num2;
        while (mul < prod) {
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            mul = num1 * num2;
        }
        return new long[]{num1, num2, mul == prod ? 1 : 0};
    }
}
