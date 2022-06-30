package com.yeliseyenka.lesson5;

/**
 * �������:
 * �������:
 *  * �������� ������ � ������ ����� ����� �������, ����� �������������� �� �����, �
 *  * ������������, �.�. ��������� �����.
 *  * ����������:
 *  * ������ ������ ������ "��� � �� �����" - ���������� ����������� n-����� ����������� ��������� �����. ��
 *  * ����� ������������ ��������� ������� ���������.
 */

public class HomeWorkTask10 {
    public static void main(String[] args) {

        int n;
        int multiplication = 1;

        for (n = 0; n < 5; n++) {
            int x = (int) (Math.random() * 20) + 1;
            System.out.println(x);
            multiplication *= x;
        }

        double averageMultiplier = Math.pow(multiplication, 1.0 / n);

        System.out.println("Multiplication of numbers: " + multiplication);
        System.out.println("The average multiplier is: " + averageMultiplier);
    }
}
