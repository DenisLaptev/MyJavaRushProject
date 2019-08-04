package com.javarush.JavaSyntax.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human h1 = new Human("Аня",false,21);
        Human h2 = new Human("Катя",false,25);
        Human h3 = new Human("Игорь",true,22);
        Human h4 = new Human("Михаил",true,23);

        Human h5 = new Human("Павел",true,23,h3,h2);
        Human h6 = new Human("Михаил",true,24,h3,h2);
        Human h7 = new Human("Андрей",true,13,h3,h2);
        Human h8 = new Human("Владислав",true,13,h3,h2);
        Human h9 = new Human("Анатолий",true,2,h3,h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}