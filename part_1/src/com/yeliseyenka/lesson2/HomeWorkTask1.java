package com.yeliseyenka.lesson2;

public class HomeWorkTask1 {
    public static void main(String[] args) {

        int onlySeconds = 4500;
        int sec = onlySeconds % 60;
        int allMinutes = (onlySeconds - sec) / 60;
        int min = allMinutes % 60;
        int allHours = (allMinutes - min) / 60;
        int hours = allHours % 60;
        int allDays = (allHours - hours) / 24;
        int days = allDays % 7;
        int allWeak = (allDays - days) / 7;

        System.out.println("A) " + allMinutes + " min " + sec + " sec");
        System.out.println("B) " + allHours+ " hours " + min + " min " + sec + " sec");
        System.out.println("C) " + allDays + " days " + hours+ " hours " + min + " min " + sec + " sec");
        System.out.println("D) " + allWeak + " weaks " + days + " days " + hours + " hours " + min + " min " + sec + " sec");

    }
}
