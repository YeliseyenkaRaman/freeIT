package com.yeliseyenka.lesson3;

import java.util.Random;

/**
 * Задание:
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */

public class HomeWorkTask7 {
    public static void main(String[] args) {

        Random random = new Random();
        int rub = random.nextInt();

        int x = rub % 100;

        if (x < 0) {
            x *= -1;
        }


        if (10 < x && x < 20) {
            System.out.println(rub + " рублей");
        } else if ((x % 10) == 1) {
            System.out.println(rub + " рубль");
        } else if (1 < (x % 10) && (x % 10) < 5) {
            System.out.println(rub + " рубля");
        } else {
            System.out.println(rub + " рублей");
        }
    }
}
