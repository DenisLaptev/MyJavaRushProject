package com.javarush.JavaSyntax.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(lineNumber);
        return lineNumber;

    }

    public static int method2() {
        method3();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(lineNumber);
        return lineNumber;
    }

    public static int method3() {
        method4();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(lineNumber);
        return lineNumber;
    }

    public static int method4() {
        method5();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(lineNumber);
        return lineNumber;
    }

    public static int method5() {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(lineNumber);
        return lineNumber;
    }
}
