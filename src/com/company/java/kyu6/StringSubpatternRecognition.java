package com.company.java.kyu6;

/**
 * (          grupisi
 *  .         bilo koji karakter
 *  +         jednom ili vise puta
 *   )
 *   \\1+     to sto je 'uhvaceno' grupom najmanje jedanput
 *
 *   return (str + str).indexOf(str, 1) != str.length();  alternativno resenja, bez regex-a
 */
public class StringSubpatternRecognition {

    public static boolean hasSubpattern(String str) {
        return str.matches("(.+)\\1+");
    }
}

