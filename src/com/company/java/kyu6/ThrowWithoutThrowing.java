package com.company.java.kyu6;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ThrowWithoutThrowing {
    public static void arrayIndexOutOfBound() {
        int a = (new int[1])[2];
    }

    public static void negativeArraySize() {
        int[] a = new int[-1];
    }

    public static void noSuchElement() {
        new ArrayList().iterator().next();
    }

    public static void arithmetic() {
        float x = 1/0;
    }

    public static void classCast() {
        int x = (int)new Object();
    }

    public static void stackOverflow() {
        stackOverflow();
    }

    public static void nullPointer() {
        ((Object)null).toString();
    }

    public static void numberFormat() {
        Integer.parseInt("x");
    }

    public static void illegalArgument() {
        Character.toChars(-1);
    }

    public static void emptyStack() {
        new Stack().pop();
    }

    public static void bufferOverflow() {
        ByteBuffer.allocate(0).put(new byte[1]);
    }

    public static void arrayStore() {
        ((Object[])new Integer[1])[0] = 'x';
    }

    public static void unsupportedOperation() {
        Arrays.asList(new int[3]).remove(0);
    }

    public static void illegalState() {
        new ArrayList().iterator().remove();
    }
}