package com.yeliseyenka.lesson4;

import java.util.Scanner;

/**
 * Задание:
 * Написать программу, в которой в консоль будет выводится название месяца и сезон,
 * к которму этот месяц относится (написать с помощью  if  и с помощью switch)
 * */

public class HomeWorkTask9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");

        String [] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        String [] season = {"Winter", "Spring", "Summer", "Autumn"};

        while(!scanner.hasNextInt()) {
            System.out.println("Incorrect value entered, repeat the input");
            scanner.next();
        }

        int monthNumber = scanner.nextInt();



        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[0]);
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[1]);
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[2]);
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[3]);
        } else {
            System.out.println("Incorrect month number");
        }

        switch (monthNumber) {
            case 3, 4, 5 -> System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[1]);
            case 6, 7, 8 -> System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[2]);
            case 9, 10, 11 -> System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[3]);
            case 12, 1, 2 -> System.out.println("Month: " + month[monthNumber - 1] + ", season: " + season[0]);
            default -> System.out.println("Incorrect month number");
        }
    }
}
