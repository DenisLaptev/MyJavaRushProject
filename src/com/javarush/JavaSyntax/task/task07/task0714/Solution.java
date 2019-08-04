package com.javarush.JavaSyntax.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> stringList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String string = bufferedReader.readLine();
            stringList.add(string);
        }

        stringList.remove(2);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(stringList.size() - 1 - i));
        }
    }
}
