package com.yeliseyenka.lesson5;

/**
 * Задание:
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 * */

public class HomeWorkTask13 {
    public static void main(String[] args) {


        int integerNumber = 5;
        int sumNNumbers = 0;

        for (int i = 1; i <= integerNumber; i++) {
            sumNNumbers += i;
        }

        System.out.println(sumNNumbers);
    }
}
