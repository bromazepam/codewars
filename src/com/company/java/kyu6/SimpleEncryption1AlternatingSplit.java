package com.company.java.kyu6;

public class SimpleEncryption1AlternatingSplit {

    public static String encrypt(final String text, final int n) {
        String fh = "";
        String sh = "";
        String text2 = "";
        if(n<=0 || text==null){
            return text;
        } else {
            for(int i=0;i<text.length();i++){
                if(i%2==0){
                    sh +=text.charAt(i);
                } else {
                    fh +=text.charAt(i);
                }
            }
            text2 = fh+sh;
            return encrypt(text2, n-1);
        }
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(n<=0 || encryptedText==null){
            return encryptedText;
        } else {
            int d = (int)Math.floor(encryptedText.length()/2);
            String fh = encryptedText.substring(0,d);
            String sh = encryptedText.substring(d);
            int stop = sh.length();
            String text= "";
            for(int i =0;i<stop;i++){
                if((i==stop-1) && (fh.length()<stop)){
                    text +=sh.charAt(i);
                } else {
                    text +=sh.charAt(i);
                    text +=fh.charAt(i);
                }
            }
            return decrypt(text, n-1);
        }
    }
}