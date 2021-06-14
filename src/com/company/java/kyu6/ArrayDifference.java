package com.company.java.kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 *
 * It should remove all values from list a, which are present in list b keeping their order.
 *
 * array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
 *
 * If a value is present in b, all of its occurrences must be removed from the other:
 *
 * array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)
 */

public class ArrayDifference {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<Integer>(a.length);
        for (int i : a){
            list.add(i);
        }
        List<Integer> list2 = new ArrayList<Integer>(b.length);
        for (int i : b) {
            list2.add(i);
        }
        list.removeAll(list2);
        return list.stream().mapToInt(i->i).toArray();
    }
}
