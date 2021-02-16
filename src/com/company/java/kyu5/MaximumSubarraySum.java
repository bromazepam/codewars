package com.company.java.kyu5;

/**
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence
 * in an array or list of integers:
 *
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 *
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
 * If the list is made up of only negative numbers, return 0 instead.
 *
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 **/

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int tempSum = 0;
        int maxSum = 0;
        if (arr == null)
            return -1;

        for (int j = arr.length - 1; j >= 1; j--) {
            for (int i = j; i >= 0; i--) {
                tempSum += arr[i];
                if (tempSum > maxSum)
                    maxSum = tempSum;
            }
            tempSum = 0;
        }
        return maxSum;
    }
}
//not great not terrible


/** better solutions :)
 * public static int sequence(int[] arr) {
 *         int max_ending_here = 0, max_so_far = 0;
 *         for (int v : arr) {
 *             max_ending_here = Math.max(0, max_ending_here + v);
 *             max_so_far = Math.max(max_so_far, max_ending_here);
 *         }
 *         return max_so_far;
 *     }
 *
 *
 *
 *     public static int sequence(int[] arr) {
 *     int cur = 0, max = 0;
 *     for (int i : arr) {
 *       cur = Math.max(0, cur + i);
 *       max = Math.max(max, cur);
 *     }
 *     return max;
 *   }
 **/