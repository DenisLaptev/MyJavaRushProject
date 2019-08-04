package com.javarush.JavaSyntax.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> stringList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String string = bufferedReader.readLine();
            stringList.add(string);
        }

        int currentStringLength = stringList.get(0).length();
        for (int i = 1; i < stringList.size(); i++) {
            if (currentStringLength > stringList.get(i).length()) {
                System.out.println(i);
                break;
            } else {
                currentStringLength = stringList.get(i).length();
            }
        }
    }
}

