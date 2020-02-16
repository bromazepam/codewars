package com.company.java.kyu6;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        String[] wave = new String[str.length()];
        for(int i=0; i<str.length();i++){
            if(!str.substring(i,i+1).equals(" ")){
                str = str.toLowerCase();
                wave[i]=str.substring(0,i)+str.substring(i,i+1).toUpperCase()+str.substring(i+1);
                System.out.print(wave[i] + ", ");
            }
        }
        List<String> list = new ArrayList<String>();
        for(String s : wave) {
            if(s != null && s.length() > 0) {
                list.add(s);
            }
        }
        wave = list.toArray(new String[list.size()]);
        return wave;
    }
}
