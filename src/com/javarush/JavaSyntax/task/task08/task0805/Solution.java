package com.javarush.JavaSyntax.task.task08.task0805;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
На экране — значения!
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            String value = entry.getValue();
//            System.out.println(value);
//        }
//
//        System.out.println("------------------------------------");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String value = entry.getValue();
            System.out.println(value);
        }


    }
}
