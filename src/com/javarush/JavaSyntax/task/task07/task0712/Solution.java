package com.javarush.JavaSyntax.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String string = bufferedReader.readLine();
            stringList.add(string);
        }

        int minLength = stringList.get(0).length();
        int maxLength = stringList.get(0).length();

        for (int i = 0; i < 10; i++) {
            if (minLength > stringList.get(i).length()) {
                minLength = stringList.get(i).length();
            }
            if (maxLength < stringList.get(i).length()) {
                maxLength = stringList.get(i).length();
            }
        }


        for (int i = 0; i < 10; i++) {
            if (stringList.get(i).length() == minLength) {
                System.out.println(stringList.get(i));
                break;
            }
            if (stringList.get(i).length() == maxLength) {
                System.out.println(stringList.get(i));
                break;
            }
        }
    }
}
