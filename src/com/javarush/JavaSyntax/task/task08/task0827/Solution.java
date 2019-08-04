package com.javarush.JavaSyntax.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println("JANUARY 1 2013 = " + isDateOdd("MAY 1 2013"));
        System.out.println("JANUARY 1 2013 = " + isDateOdd("JANUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        boolean isDateOdd = true;

        Date myDate = new Date(date);

        String pattern1 = "MM dd yyyy";
        //String pattern2 = "dd MM yyyy";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
        //SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);

        //System.out.println(simpleDateFormat1.format(myDate));
        //System.out.println(simpleDateFormat2.format(myDate));

        int dayOfMonth = Integer.parseInt(simpleDateFormat1.format(myDate).trim().split("\\s+")[1]);
        int month = Integer.parseInt(simpleDateFormat1.format(myDate).trim().split("\\s+")[0]);
        int year = Integer.parseInt(simpleDateFormat1.format(myDate).trim().split("\\s+")[2]);

        //System.out.println(dayOfMonth);
        //System.out.println(month);
        //System.out.println(year);

        Calendar calendar = new GregorianCalendar(year,month,dayOfMonth);

        //System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        if (dayOfYear%2!=0) {
            isDateOdd = false;
        } else {
            isDateOdd = true;
        }
        return isDateOdd;
    }
}
