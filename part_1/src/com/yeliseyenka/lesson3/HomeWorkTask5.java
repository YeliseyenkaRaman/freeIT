package com.yeliseyenka.lesson3;

import java.util.Scanner;

/**
 * Задание:
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 * */

public class HomeWorkTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any natural number: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Incorrect value entered, repeat the input");
            scanner.next();
        }

        int unknownNumber = scanner.nextInt();
        int x = unknownNumber;

        if (x < 0) {
            x *= -1;
        }

        if (100 > x || x > 999) {
            System.out.println("This number is not three-digit");
        } else {
            System.out.println("This number is three-digit");
        }

        if ((x % 10) == 7) {
            System.out.println("The last digit of the number is 7");
        } else {
            System.out.println("The last digit of the number is not 7");
        }

        if ((x % 2) == 0 && x != 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is not even");
        }

        System.out.println("This is a number: " + unknownNumber);
    }
}
