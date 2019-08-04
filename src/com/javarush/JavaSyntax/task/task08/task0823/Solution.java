package com.javarush.JavaSyntax.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String[] words = string.trim().split("\\s+");
        String[] newWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            //System.out.println(words[i]);
            newWords[i] = words[i].substring(0, 1).toUpperCase()+words[i].substring(1);
        }

        String newString = "";
        for (int i = 0; i < newWords.length - 1; i++) {
            newString += (newWords[i] + " ");
        }
        newString += newWords[newWords.length - 1];

        System.out.println(newString);
    }
}
