package com.company.java.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            strList.add(i, String.valueOf(num).substring(i, i + 1));
        }
        Collections.sort(strList, Collections.reverseOrder());
        String str = "";
        for (String n : strList) {
            str = str.concat(n);
        }
        return Integer.parseInt(str);
    }
}
