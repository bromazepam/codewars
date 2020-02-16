package com.company.java.kyu6;

public class GiveMeADiamond {
    public static String print(int n) {
//   String str = "";
        StringBuilder sb = new StringBuilder();
        if(n%2==0 || n<0)
            return null;
        for(int i=1;i<=n;i=i+2){
            for(int j=n-1;j>i;j=j-2)
                sb.append(" ");
            for(int k=1;k<=i;k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        //second half
        for(int i=n-2;i>=1;i=i-2){
            for(int j=i;j<=n-2;j=j+2){
                sb.append(" ");
            }
            for(int k=i;k>=1;k--){
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
