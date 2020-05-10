package com.company.java.kyu6;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CountTheDays {
    public String countDays(Date d) {
        Date time = d;
        Date today = new Date();
        String s = "";
        if (time.compareTo(today) > 0) {
            long diffInMillies = time.getTime() - today.getTime();
            long days = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            s += days + " days";
        } else if (time.compareTo(today) < 0) {
            s += "The day is in the past!";
        } else if (time.compareTo(today) == 0) {
            s += "Today is the day!";
        }
        return s;
    }
}

// jednostavnije
//    Date now = new Date();
//        if(now.equals(d))return"Today is the day!";
//                else if(now.after(d))return"The day is in the past!";
//                else return TimeUnit.DAYS.convert(d.getTime()-now.getTime(),TimeUnit.MILLISECONDS)+" days";
