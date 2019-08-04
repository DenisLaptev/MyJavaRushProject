package com.javarush.JavaSyntax.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        boolean result = false;
        int pointsThis = 0;
        int pointsAnother = 0;

        if (this.age > anotherCat.age) {
            pointsThis++;
        }
        if (this.weight > anotherCat.weight) {
            pointsThis++;
        }
        if (this.strength > anotherCat.strength) {
            pointsThis++;
        }


        if (anotherCat.age > this.age) {
            pointsAnother++;
        }
        if (anotherCat.weight > this.weight) {
            pointsAnother++;
        }
        if (anotherCat.strength > this.strength) {
            pointsAnother++;
        }

        if (pointsThis > pointsAnother) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 1;
        cat1.strength = 5;
        cat1.weight = 100;

        cat2.age = 1;
        cat2.strength = 5;
        cat2.weight = 120;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
