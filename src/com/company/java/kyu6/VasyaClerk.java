package com.company.java.kyu6;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine){
        int q=0; int h = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) q++;
            if (peopleInLine[i] == 50) {
                q--;
                h++;
            }
            if (peopleInLine[i] == 100) {
                if (h > 0) {
                    h--;
                    q--;
                } else q -= 3;
            }
            if (q < 0) return "NO";
        }
        return "YES";
    }
}
