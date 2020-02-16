package com.company.java.kyu6;

public class LongestPalindrome {
    public static int longestPalindrome(final String s) {
        if(s.length()==0)
            return 0;
        int maxLength = 1, start = 0, low, high;
        // One by one consider every character as center
        // point of even and length palindromes
        for (int i = 1; i < s.length(); ++i)
        {
            // Find the longest even length palindrome with
            // center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            // Find the longest odd length palindrome with
            // center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        return maxLength;
    }
}
