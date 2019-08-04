package com.javarush.JavaSyntax.task.task07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String string = scanner.nextLine();
            stringList.add(string);
        }

        for (int i = 0; i < 13; i++) {
            String tmpString = stringList.get(4);
            stringList.remove(4);
            stringList.add(0, tmpString);
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
