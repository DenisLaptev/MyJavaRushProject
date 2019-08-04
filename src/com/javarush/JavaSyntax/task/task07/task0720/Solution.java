package com.javarush.JavaSyntax.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String string = reader.readLine();
            stringList.add(string);
        }

        //System.out.println("----------------------");
        //System.out.println(stringList);

        for (int i = 0; i < M; i++) {
            stringList.add(stringList.get(0));
            stringList.remove(0);
        }
        //System.out.println("----------------------");
        //System.out.println(stringList);

        for (String aStringList : stringList) {
            System.out.println(aStringList);
        }
    }
}
