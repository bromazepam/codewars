package com.company.java.kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences < 1) return new int[0];
        final HashMap<Integer,Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();
        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < maxOccurrences) list.add(i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
