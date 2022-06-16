package com.yeliseyenka.lesson2;

import java.util.Scanner;

public class HomeWorkTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number is larger");
        } else {
            System.out.println("The second number is larger");
        }
    }
}
