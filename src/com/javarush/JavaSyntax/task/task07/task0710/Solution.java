package com.javarush.JavaSyntax.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> stringsList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String string = bufferedReader.readLine();
            stringsList.add(0, string);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stringsList.get(i));
        }
    }
}
