package com.javarush.JavaSyntax.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();
        String currentString = "";

        while (true) {
            currentString = reader.readLine();
            if (currentString.equals("end")) {
                break;
            } else {
                stringList.add(currentString);
            }
        }

        for (String aStringList : stringList) {
            System.out.println(aStringList);
        }
    }
}