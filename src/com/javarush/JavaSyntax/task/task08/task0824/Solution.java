package com.javarush.JavaSyntax.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1 = new Human();
        Human grandMother1 = new Human();
        Human grandFather2 = new Human();
        Human grandMother2 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();

        grandFather1.name = "Grand Father 1";
        grandFather1.sex = true;
        grandFather1.age = 62;
        grandFather1.children = new ArrayList<Human>(Arrays.asList(father));

        grandMother1.name = "Grand Mother 1";
        grandMother1.sex = false;
        grandMother1.age = 57;
        grandMother1.children = new ArrayList<Human>(Arrays.asList(father));

        grandFather2.name = "Grand Father 2";
        grandFather2.sex = true;
        grandFather2.age = 60;
        grandFather2.children = new ArrayList<Human>(Arrays.asList(mother));

        grandMother2.name = "Grand Mother 2";
        grandMother2.sex = false;
        grandMother2.age = 55;
        grandMother2.children = new ArrayList<Human>(Arrays.asList(mother));

        father.name = "Father";
        father.sex = true;
        father.age = 30;
        father.children = new ArrayList<Human>(Arrays.asList(child1, child2, child3));

        mother.name = "Mother";
        mother.sex = false;
        mother.age = 25;
        mother.children = new ArrayList<Human>(Arrays.asList(child1, child2, child3));

        child1.name = "Child1";
        child1.sex = true;
        child1.age = 10;
        child1.children = new ArrayList<>();

        child2.name = "Child2";
        child2.sex = false;
        child2.age = 12;
        child2.children = new ArrayList<>();

        child3.name = "Child3";
        child3.sex = true;
        child3.age = 2;
        child3.children = new ArrayList<>();


        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
