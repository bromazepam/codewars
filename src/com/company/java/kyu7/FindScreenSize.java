package com.company.java.kyu7;

public class FindScreenSize {
    public static String findScreenHeight(int width, String ratio) {
        float x, y, z;
        int j;
        String[] str = ratio.split(":");
        z = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
        x=(width/z)*y;
        j=(int)x;
        return width+"x"+j;
    }
}
//not great not terrible
