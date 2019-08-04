package com.javarush.JavaSyntax.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Man1", 18, "address1");
        Man man2 = new Man("Man2", 20, "address2");

        Woman woman1 = new Woman("Woman1", 18, "address3");
        Woman woman2 = new Woman("Woman2", 20, "address4");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
