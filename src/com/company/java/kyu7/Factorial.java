package com.company.java.kyu7;

public class Factorial {
    public int factorial(int n) {
        // Happy coding :-)
        int sum =1;
        if(n<=12 && n>=0) {
            for(int i =1;i<=n;i++){
                sum=sum*i;
            }
            return sum;
        } else {
            throw new IllegalArgumentException("error");
        }
    }
}
