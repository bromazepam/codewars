package com.company.java.kyu6;

public class L3375p34k {
    public String encode(String source) {
        return source == null ? "" : source.replaceAll("[aA]", "4")
                .replaceAll("[eE]", "3")
                .replaceAll("[lL]", "1")
                .replaceAll("[mM]", "/^^\\\\")
                .replaceAll("[oO]", "0")
                .replaceAll("[uU]", "(_)");
    }
}

/**
 since a regex and Java both use the back slash as an escape character you need to give four backslashes here:
 Java: "\\\\"
 Regex: "\\"
 Actual: "\"
**/