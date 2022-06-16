package com.yeliseyenka.lesson2;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any natural four-digit number: ");
        int fourDigitNumber = scanner.nextInt();

        if (999 > fourDigitNumber || fourDigitNumber > 9999) {
            System.out.println("You entered an incorrect number");
        } else {
            int theFourthDigit = fourDigitNumber % 10;
            int noFourthDigit = (fourDigitNumber - theFourthDigit) / 10;
            int theThirdDigit = noFourthDigit % 10;
            int noThirdDigit = (noFourthDigit - theThirdDigit) / 10;
            int theSecondDigit = noThirdDigit % 10;
            int theFirstDigit = (noThirdDigit - theSecondDigit) / 10;

            if ((theFirstDigit != theSecondDigit) && (theFirstDigit != theThirdDigit) && (theFirstDigit != theFourthDigit)
                && (theSecondDigit != theThirdDigit) && (theSecondDigit != theFourthDigit) && (theThirdDigit != theFourthDigit)) {

                System.out.println("All digits are numbers of different");
            } else {
                System.out.println("Not all digits are numbers of different");
            }

        }
    }
}
