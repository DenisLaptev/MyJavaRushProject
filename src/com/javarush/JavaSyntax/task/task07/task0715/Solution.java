package com.javarush.JavaSyntax.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("мама");
        stringList.add("мыла");
        stringList.add("раму");

        for (int i = 0; i < stringList.size();i+=2) {
            stringList.add(i+1, "именно");
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
