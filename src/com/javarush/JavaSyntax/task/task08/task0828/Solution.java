package com.javarush.JavaSyntax.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String month = bufferedReader.readLine();
        Map<String, Integer> monthsMap = new HashMap<>();
        monthsMap.put("January", 1);
        monthsMap.put("February", 2);
        monthsMap.put("March", 3);
        monthsMap.put("April", 4);
        monthsMap.put("May", 5);
        monthsMap.put("June", 6);
        monthsMap.put("July", 7);
        monthsMap.put("August", 8);
        monthsMap.put("September", 9);
        monthsMap.put("October", 10);
        monthsMap.put("November", 11);
        monthsMap.put("December", 12);

        System.out.println(month + " is the " + monthsMap.get(month) + " month ");
    }
}
