package com.yeliseyenka.lesson5;

/**
 * Задание:
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 * */

public class HomeWorkTask13 {
    public static void main(String[] args) {

        int firstNIntegers = 7;
        int sumNIntegers= 0;
        int k = 0;

        for (int i = 1; i <= firstNIntegers; i++) {
            k += 3;
            sumNIntegers += k;

        }
        System.out.println(sumNIntegers);
    }
}
