package com.company.java.kyu6;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String s = "(" + numbers[0]+ numbers[1]+ numbers[2]+") "+ numbers[3]+ numbers[4]+ numbers[5]
                +"-"+ numbers[6]+ numbers[7]+ numbers[8]+ numbers[9];
        return s;
    }
}
//not great, not terrible
