package com.javarush.JavaSyntax.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int result = Thread.currentThread().getStackTrace().length;
        //System.out.println(Thread.currentThread().getStackTrace());
        System.out.println(result);
        return result;
    }
}

