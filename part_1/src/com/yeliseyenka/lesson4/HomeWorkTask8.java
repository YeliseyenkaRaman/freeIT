package com.yeliseyenka.lesson4;

import java.util.Scanner;

/**
 * Задание:
 * Написать 5 способов создания/получения строки
 * */

public class HomeWorkTask8 {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = "str1";
        String string2 = args[0];

        System.out.println("Enter string3: ");
        String string3 = scanner.nextLine();
        int noString = 123;
        String string4 = String.valueOf(noString);
        String [] string5 = {"str1", "str2", "str3", "str4", "str5"};

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5[4]);
    }
}
