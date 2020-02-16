package com.company.java.kyu6;

public class MultiplesOf3Or5 {
    public int solution(int number) {
        int sum = 0;
        for(int i=number-1;i>=3;i--){
            if((i%3==0)&&(i%5==0)) sum+=i;
            else if ((i%3==0)||(i%5==0)) sum+=i;
        }
        return sum;
    }
}
