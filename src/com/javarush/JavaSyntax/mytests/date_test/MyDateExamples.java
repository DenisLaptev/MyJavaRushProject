package com.javarush.JavaSyntax.mytests.date_test;

import java.util.Date;

public class MyDateExamples {

    public static void main(String[] args) throws Exception {
        Date today = new Date();
        System.out.println("Current date: " + today);

        System.out.println("---------------------------");

        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");

        System.out.println("---------------------------");

        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime2 = new Date();
        if (currentTime2.after(endDate)) {//проверяем что время currentTime после endDate
            System.out.println("End time!");
        }

        System.out.println("---------------------------");

        Date currentTime3 = new Date();
        int hours = currentTime3.getHours();
        int mins = currentTime3.getMinutes();
        int secs = currentTime3.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);










        System.out.println("---------------------------");
        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        System.out.println(date1.equals(date2));

    }
}
