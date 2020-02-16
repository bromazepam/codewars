package com.company.java.kyu6;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> list=new ArrayList<Integer>();
        if(lng==0 || wdth==0 || lng==wdth)
            return null;
        while(lng>0){
            if(lng>wdth){
                lng=lng-wdth;
                list.add(wdth);
            }
            if(lng<wdth){
                wdth=wdth-lng;
                list.add(lng);
            }
            if(lng==wdth){
                list.add(lng);
                break;
            }
        }
        return list;
    }
}
