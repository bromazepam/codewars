package com.company.java.kyu6;
import static preload.Preload.oneTwo;

public class Return123Randomly {

    public static int oneTwoThree() {
        int a = oneTwo();
        int b = oneTwo();
        if(a==1 && b==2) return 3;
        if(a==2 && b==1) return 2;
        if(a==2 && b==2) return 1;
        return oneTwoThree();
    }
}
//vazno je da svaki od uslova ima 1/3 verovatnoce da se dogodi,
//4. slucaj a=1 & b=1 se ne racuna i zbog toga se u tom slucaju
//ponovo poziva metoda oneTwoThree()
