package com.yeliseyenka.lesson5;

/**
 * �������:
 * ������� ����� ������ n ����� �����, ������� ������� �� 3.
 */

public class HomeWorkTask13 {
    public static void main(String[] args) {


        int integerNumber = 9;
        int sumNNumbers = 0;

        for (int i = 3; i <= integerNumber; i += 3) {
            sumNNumbers += i;
        }

        System.out.println(sumNNumbers);
    }
}
