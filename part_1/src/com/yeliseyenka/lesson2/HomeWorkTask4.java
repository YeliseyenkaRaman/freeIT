package com.yeliseyenka.lesson2;

import java.util.Scanner;

/**
 * Задание:
 * Написать программу, результатом работы которой будет вывод результата сравнения двух введенных чисел.
 */


public class HomeWorkTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        while(!scanner.hasNextDouble()) {
            System.out.println("It's not a number");
            scanner.next();
        }

        double firstNumber = scanner.nextDouble();

        while(!scanner.hasNextDouble()) {
            System.out.println("It's not a number");
            scanner.next();
        }

        double secondNumber = scanner.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number is larger");
        } else {
            System.out.println("The second number is larger");
        }
    }
}
