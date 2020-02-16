package com.company.java.kyu6;

public class ValidBraces {
    public boolean isValid(String braces) {
        char[] stack = new char[braces.length() + 1];
        int top = 0;
        char c;
        for (int i = 0; i < braces.length(); i++) {
            c = braces.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else if ((c == ')' && stack[top] == '(') || (c == ']' && stack[top] == '[')
                    || (c == '}' && stack[top] == '{')) {
                top--;
            } else {
                return false;
            }
        }
        if (top != 0)
            return false;
        return true;
    }
}
