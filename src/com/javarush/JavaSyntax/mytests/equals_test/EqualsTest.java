package com.javarush.JavaSyntax.mytests.equals_test;

public class EqualsTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");
        Cat cat2 = new Cat("Vaska");

        /*
        Происходит сравнение объектов.
        Если в классе Cat не переопределен метод equals(),
        на экран будет выведено false.
        Переменные хранят ссылки на два идентичных объекта Cat,
        но не на один и тот же. */
        System.out.println(cat1.equals(cat2));
    }
}
