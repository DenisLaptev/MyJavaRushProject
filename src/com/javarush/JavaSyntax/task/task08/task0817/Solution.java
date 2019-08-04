package com.javarush.JavaSyntax.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String>namesList = new ArrayList<>();
        Set<String>namesSet = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            namesList.add(entry.getValue());
            namesSet.add(entry.getValue());
        }

        for (String nameFromSet : namesSet) {
            int count =0;
            for (String nameFromList : namesList) {
                if(nameFromList.equals(nameFromSet)){
                    count++;
                }
            }
            if(count>1){
                removeItemFromMapByValue(map, nameFromSet);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {


//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("rIFMBV:" + entry.getKey() + " - " + entry.getValue());
//        }
//        System.out.println("----------------------------------");
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("rIFMBV:" + entry.getKey() + " - " + entry.getValue());
//        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        removeTheFirstNameDuplicates(map);

    }
}
