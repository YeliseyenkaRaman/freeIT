package com.yeliseyenka.lesson5;

/**
 * «адание:
 * ѕосчитать факториал числа в границах от 10 до 15 (не использу€ рекурсию).
 * */

public class HomeWorkTask11 {
    public static void main(String[] args) {

        long factorialN = 1;

        for (int i = 1; i <= 15; i++) {

            factorialN *= i;

            if (i >= 10) {
                System.out.println("The factorial of the number " + i + " is equal to: " + factorialN);
            }
        }
    }
}
