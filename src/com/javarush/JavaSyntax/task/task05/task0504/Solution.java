package com.javarush.JavaSyntax.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Cat cat1 = new Cat("Cat1", 1, 2, 100);
        Cat cat2 = new Cat("Cat2", 2, 3, 200);
        Cat cat3 = new Cat("Cat3", 4, 4, 400);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}