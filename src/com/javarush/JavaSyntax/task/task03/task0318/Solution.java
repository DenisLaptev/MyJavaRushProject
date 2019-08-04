package com.javarush.JavaSyntax.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        //System.out.println("Enter number of years:");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();

        //System.out.println("Enter name:");
        String name = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();

        System.out.println();



        System.out.println();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
