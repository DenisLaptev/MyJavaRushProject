package com.javarush.JavaSyntax.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        int numberOfCats = 10;
        for (int i = 0; i < numberOfCats; i++) {
            new Cat();
        }

        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        // Создай конструктор

        public Cat() {
            Cat.catCount++;
        }
    }
}
