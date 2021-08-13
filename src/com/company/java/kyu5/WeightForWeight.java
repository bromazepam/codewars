package com.company.java.kyu5;

import java.util.Arrays;
import java.util.List;

/**
 * My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the
 * weights of members is published and each month he is the last on the list which means he is the heaviest.
 * I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list".
 * It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
 * Given a string with the weights of FFC members in normal order can you give
 * this string ordered by "weights" of these numbers?
 * Example:
 *      "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 *      "100 180 90 56 65 74 68 86 99"
 * When two numbers have the same "weight", let us class them as if they were strings
 * (alphabetical ordering) and not numbers:
 * 180 is before 90 since, having the same "weight" (9), it comes before as a string.
 * All numbers in the list are positive numbers and the list can be empty.
 */
public class WeightForWeight {

    public static String orderWeight(String strng) {
        List<String> s = Arrays.asList(strng.split(" "));
        s.sort((o1, o2) -> {
            int diff = getSum(o1) - getSum(o2);
            return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
        });
        return String.join(" ", s);
    }

    private static int getSum(String str){
        int sum = 0;
        for(String s: str.split("")){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
