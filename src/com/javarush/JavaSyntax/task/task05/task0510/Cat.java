package com.javarush.JavaSyntax.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        age = 1;
        weight = 2;
        address = null;
        color = "grey";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        address = null;
        color = "grey";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 2;
        address = null;
        color = "grey";
    }

    public void initialize(int weight, String color) {
        name = null;
        age = 1;
        this.weight = weight;
        address = null;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        name = null;
        age = 1;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
