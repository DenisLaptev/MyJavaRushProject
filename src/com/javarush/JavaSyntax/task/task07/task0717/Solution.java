package com.javarush.JavaSyntax.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String string = bufferedReader.readLine();
            list.add(string);
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String string : result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> resultList = new ArrayList<>();
        int initialListSize = list.size();
        for (int i = 0; i < initialListSize; i++) {
            resultList.add(list.get(i));
            resultList.add(list.get(i));
        }

        return resultList;
    }
}
