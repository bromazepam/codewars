package com.company.java.kyu6;

public class FLAMESGameVersion1 {
    public static String showRelationship(String male, String female) {
        String commonChars = "";
        for (int i = 0; i < male.length(); i++) {
            for (int j = 0; j < female.length(); j++) {
                if (male.charAt(i) == female.charAt(j)) {
                    commonChars += male.charAt(i);
                }
            }
        }
        for(int i = 0; i < commonChars.length(); i ++) {
            String charToRemove = commonChars.charAt(i)+"";
            male = male.replace(charToRemove, "");
            female = female.replace(charToRemove, "");
        }

        int length = male.length()+female.length();
        if(length >6){
            length = length%6;
        }
        switch(length){
            case 1:
                return "Friendship";
            case 2:
                return "Love";
            case 3:
                return "Affection";
            case 4:
                return "Marriage";
            case 5:
                return "Enemies";
            case 6:
            case 0:
                return "Siblings";
        }
        return null;
    }
}
