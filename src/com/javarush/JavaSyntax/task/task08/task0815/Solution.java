package com.javarush.JavaSyntax.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Petr");
        map.put("Petrov", "Nick");
        map.put("Smith", "Ivan");
        map.put("Kuznetcov", "Bill");
        map.put("Sidorov", "Ivan");
        map.put("Black", "Ivan");
        map.put("White", "Adam");
        map.put("Brown", "Ivan");
        map.put("Armstrong", "Eva");
        map.put("Willis", "Nick");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
