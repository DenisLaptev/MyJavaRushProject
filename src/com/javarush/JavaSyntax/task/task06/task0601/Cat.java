package com.javarush.JavaSyntax.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    //напишите тут ваш код
    public static void main(String[] args) {

    }
    protected void finalize() throws Throwable{
        System.out.println("Hi");
    }
}
