package com.javarush.JavaSyntax.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String string = bufferedReader.readLine();
            strings.add(string);
        }

        int maxLength = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if(maxLength<strings.get(i).length()){
                maxLength = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == maxLength){
                System.out.println(strings.get(i));
            }
        }
    }
}
