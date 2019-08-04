package com.javarush.JavaSyntax.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> mySet = new HashSet<>();

        mySet.add("арбуз");
        mySet.add("банан");
        mySet.add("вишня");
        mySet.add("груша");
        mySet.add("дыня");
        mySet.add("ежевика");
        mySet.add("женьшень");
        mySet.add("земляника");
        mySet.add("ирис");
        mySet.add("картофель");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

    }
}
