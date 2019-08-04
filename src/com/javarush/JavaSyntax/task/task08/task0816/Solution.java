package com.javarush.JavaSyntax.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварцнегер", dateFormat.parse("MARCH 1 2013"));
        map.put("Вандам", dateFormat.parse("APRIL 1 2012"));
        map.put("Норрис", dateFormat.parse("MAY 1 2012"));
        map.put("Чан", dateFormat.parse("JUNE 1 2012"));
        map.put("Ли", dateFormat.parse("JULY 1 2012"));
        map.put("Уиллис", dateFormat.parse("AUGUST 1 2012"));
        map.put("Доуни", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сигал", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Смит", dateFormat.parse("NOVEMBER 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

//        for (Map.Entry<String, Date> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getMonth());
//        }
//        System.out.println("----------------------------------");

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();
            if (month == 5 || month == 6 || month == 7) {
                iterator.remove();
            }
        }


//        for (Map.Entry<String, Date> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getMonth());
//        }
    }

    public static void main(String[] args) {

//        Map<String, Date> map = new HashMap<>();
//        try {
//            map = createMap();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        removeAllSummerPeople(map);
    }
}
