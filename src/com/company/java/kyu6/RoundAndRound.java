package com.company.java.kyu6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundAndRound {
        public static double roundTo2DecimalPlaces(double number) {
            String str = String.format("%.2f", number);
            double value = Double.valueOf(str);
            return value;
        }
    }
//not great, not terrible



//
//    public static double roundTo2DecimalPlaces(double number) {
//        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
//    }
