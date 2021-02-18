package com.company.java.kyu6;

/**
 * Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.
 * If n is greater than 0 it should rotate the array to the right. If n is less than 0 it should rotate the array to
 * the left. If n is 0, then it should return the array unchanged.
 * Example:
 *
 * Object[] data = new Object[]{1, 2, 3, 4, 5};
 *
 * rotate(data, 2)    =>    {4, 5, 1, 2, 3}
 * rotate(data, -1)    =>    {2, 3, 4, 5, 1}
 */
public class RotateArray {
    public Object[] rotate(Object[] data, int n) {
        if (n == 0) return data;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                Object tempArrayElement = data[data.length - 1];
                for (int j = data.length - 1; j > 0; j--) {
                    data[j] = data[j - 1];
                }
                data[0] = tempArrayElement;
            }
            return data;
        }
        for (int i = 0; i > n; i--) {
            Object tempArrayElement = data[0];
            for (int j = 0; j < data.length - 1; j++) {
                data[j] = data[j + 1];
            }
            data[data.length - 1] = tempArrayElement;
        }
        return data;
    }
}

/**
 * better solution
 * Collections.rotate(Arrays.asList(data), n);
 * return data;
 **/