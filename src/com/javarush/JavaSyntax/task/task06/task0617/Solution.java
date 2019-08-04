package com.javarush.JavaSyntax.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }


    public static class Idea {

        public String getDescription() {
            String text = "I am clever and young!";
            return text;
        }
    }
}
