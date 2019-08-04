package com.javarush.JavaSyntax.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        int numberOfCats = 10;
        for (int i = 0; i < numberOfCats; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }


        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
