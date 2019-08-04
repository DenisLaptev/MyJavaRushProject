package com.javarush.JavaSyntax.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String string = bufferedReader.readLine();
            strings.add(string);
        }

        int minLength = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if(minLength>strings.get(i).length()){
                minLength = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == minLength){
                System.out.println(strings.get(i));
            }
        }
    }
}
