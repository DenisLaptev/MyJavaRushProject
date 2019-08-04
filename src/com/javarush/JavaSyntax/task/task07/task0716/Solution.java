package com.javarush.JavaSyntax.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> resultList = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("р") && !string.contains("л")) {

            } else {
                resultList.add(string);
            }
        }
        for (int i = 0; i < resultList.size(); ) {
            String currentString = resultList.get(i);
            if (currentString.contains("л") && !currentString.contains("р")) {
                resultList.add(i, currentString);
                i += 2;
            } else {
                i += 1;
            }
        }


        return resultList;
    }
}