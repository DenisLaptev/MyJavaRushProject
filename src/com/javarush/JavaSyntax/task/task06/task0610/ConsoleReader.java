package com.javarush.JavaSyntax.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String resultString = bufferedReader.readLine();
        return resultString;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int resultInt = scanner.nextInt();
        return resultInt;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double resultDouble = Double.parseDouble(bufferedReader.readLine());
        return resultDouble;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean resultBoolean = scanner.nextBoolean();
        return resultBoolean;
    }

    public static void main(String[] args) throws Exception {

    }
}
