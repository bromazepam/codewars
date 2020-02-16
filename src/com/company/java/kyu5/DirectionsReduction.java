package com.company.java.kyu5;

import java.util.ArrayList;
import java.util.List;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> temp = new ArrayList<String>();
        for(String str: arr){
            temp.add(str);
        }
        while(true){
            int s = temp.size();
            for(int i =0; i<temp.size()-1;i++){
                if(temp.get(i).equals("NORTH") & temp.get(i+1).equals("SOUTH") ||
                        temp.get(i).equals("SOUTH") & temp.get(i+1).equals("NORTH") ||
                        temp.get(i).equals("EAST") & temp.get(i+1).equals("WEST") ||
                        temp.get(i).equals("WEST") & temp.get(i+1).equals("EAST")) {
                    temp.remove(i);
                    temp.remove(i);
                    break;
                }
            }
            if(s == temp.size()){
                break;
            }
        }
        String[] str = new String[temp.size()];
        temp.toArray(str);
        return str;
    }
}
