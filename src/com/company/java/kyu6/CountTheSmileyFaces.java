package com.company.java.kyu6;

import java.util.Collections;
import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        int occurrences = Collections.frequency(arr, ":)") +
                Collections.frequency(arr, ":D") +
                Collections.frequency(arr, ":~)") +
                Collections.frequency(arr, ":-)") +
                Collections.frequency(arr, ":~D") +
                Collections.frequency(arr, ":-D") +
                Collections.frequency(arr, ";)") +
                Collections.frequency(arr, ";D") +
                Collections.frequency(arr, ";~)") +
                Collections.frequency(arr, ";-)") +
                Collections.frequency(arr, ";~D") +
                Collections.frequency(arr, ";-D");
        return occurrences;
    }
}
//not great not terrible
