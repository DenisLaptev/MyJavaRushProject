package com.javarush.JavaSyntax.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 100);
        map.put("Petrov", 1000);
        map.put("Smith", 2000);
        map.put("Kuznetcov", 150);
        map.put("Sidorov", 300);
        map.put("Black", 2000);
        map.put("White", 500);
        map.put("Brown", 600);
        map.put("Armstrong", 1000);
        map.put("Willis", 1500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>>iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            int salary = entry.getValue();
            if(salary<500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> map = createMap();
//
//        System.out.println(map);
//
//        removeItemFromMap(map);
//
//        System.out.println("--------------");
//
//        System.out.println(map);

    }
}