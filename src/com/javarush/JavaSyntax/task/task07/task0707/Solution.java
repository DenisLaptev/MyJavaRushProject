package com.javarush.JavaSyntax.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");

        System.out.println(stringList.size());

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
