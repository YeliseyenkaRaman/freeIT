package com.yeliseyenka.lesson5;

/**
 * �������:
 * ��������� ��������� ����� � �������� �� 10 �� 15 (�� ��������� ��������).
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
