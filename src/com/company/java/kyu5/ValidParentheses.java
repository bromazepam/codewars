package com.company.java.kyu5;

import java.util.Stack;

/**
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 */

public class ValidParentheses {
    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() > 100 || s.length() < 0) return false;
        char lastChar;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (c != ')')
                continue;
            else {
                if (stack.empty()) return false;
                lastChar = stack.pop();
                if (c == ')' && lastChar != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
