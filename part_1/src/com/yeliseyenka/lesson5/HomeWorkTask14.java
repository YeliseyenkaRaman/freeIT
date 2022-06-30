package com.yeliseyenka.lesson5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Задание:
 * Написать игру в которой нужно угадать случайно выбранную букву (именно букву). При каждом вводе
 * пользователем программа долна говорить "warmly, hot" или "chilly, cold" в зависимости от того,
 * как далеко буква пользователя от загаданной
 * */

public class HomeWorkTask14 {
    public static void main(String[] args) throws java.io.IOException {

        int randomChar = ThreadLocalRandom.current().nextInt(65, 90);
        System.out.println("Please, enter the letter:");
        char nextScannerLetter;

        while (true) {

            do {
                nextScannerLetter = (char) System.in.read();
            } while (nextScannerLetter == '\n' || nextScannerLetter == '\r');

            char upperLetter = Character.toUpperCase(nextScannerLetter);

            int i;

            if (upperLetter < 'A' || upperLetter > 'Z') {
                i = -1;
            } else if (randomChar < upperLetter) {
                i = upperLetter - randomChar;
            } else if (randomChar > upperLetter) {
                i = randomChar - upperLetter;
            } else {
                i = 0;
            }

            if (i == 0) {
                System.out.println("You Win!");
                break;
            } else if (i == -1) {
                System.out.println("You didn't enter a letter");
            } else if (1 <= i && i <= 3) {
                System.out.println("Hot");
            } else if (4 <= i && i <= 6) {
                System.out.println("Warmly");
            } else if (7 <= i && i <= 9) {
                System.out.println("Chilly");
            } else {
                System.out.println("Cold");
            }
        }
    }
}
