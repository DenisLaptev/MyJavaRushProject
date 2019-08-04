package com.javarush.JavaSyntax.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код

        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integerSet.add(i);
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код

        //System.out.println(set);
        //System.out.println("----------------------");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > 10) {
                iterator.remove();
            }
        }
        //System.out.println(set);
        return set;
    }

    public static void main(String[] args) {

        //Set<Integer> mySet = createSet();
        //removeAllNumbersGreaterThan10(mySet);

    }
}
