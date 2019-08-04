package com.javarush.JavaSyntax.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        people.put("LastName1","FirstName1");
        people.put("LastName1","FirstName1");
        people.put("LastName3","FirstName1");
        people.put("LastName4","FirstName4");
        people.put("LastName5","FirstName5");
        people.put("LastName6","FirstName6");
        people.put("LastName7","FirstName7");
        people.put("LastName1","FirstName8");
        people.put("LastName9","FirstName1");
        people.put("LastName10","FirstName10");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
