package com.javarush.JavaSyntax.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        String result = "";
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        String message = s;
        result += className + ": " + methodName + ": " + message;
        System.out.println(result);

    }
}
