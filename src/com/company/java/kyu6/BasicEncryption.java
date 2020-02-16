package com.company.java.kyu6;

public class BasicEncryption {
    public String encrypt(String text, int rule) {
        String result ="";
        for(int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int ascii = (int) character + rule;
            if(ascii>255)
                ascii=ascii%256;
            result +=Character.toString ((char) ascii);
        }
        return result;
    }
}
