package com.yeliseyenka.lesson2;

/**
 * Задание:
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 * по аналогии с примером выше.
 */

public class HomeWorkTask1 {
    public static void main(String[] args) {

        int onlySeconds = 45004501;
        int sec = onlySeconds % 60;
        int allMinutes = (onlySeconds - sec) / 60;
        int min = allMinutes % 60;
        int allHours = (allMinutes - min) / 60;
        int hours = allHours % 24;
        int allDays = (allHours - hours) / 24;
        int days = allDays % 7;
        int allWeeks = (allDays - days) / 7;

        System.out.println("A) " + allMinutes + " min " + sec + " sec");
        System.out.println("B) " + allHours+ " hours " + min + " min " + sec + " sec");
        System.out.println("C) " + allDays + " days " + hours+ " hours " + min + " min " + sec + " sec");
        System.out.println("D) " + allWeeks + " weeks " + days + " days " + hours + " hours " + min + " min " + sec + " sec");

    }
}
