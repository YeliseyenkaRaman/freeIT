package com.yeliseyenka.lesson5;

/**
 * �������:
 * ������� ����� �����, ���������� �������� �� ��� ����� �������, �.�.
 * ������� ��� ������� ������ �� 1 � ����.
 */

public class HomeWorkTask12 {
    public static void main(String[] args) {

        int simpleNumber = 3331;

        double sqrSimpleNumber = Math.sqrt(simpleNumber);
        int ceilingSqrSimpleNumber = (int) Math.ceil(sqrSimpleNumber);

        for (int i = ceilingSqrSimpleNumber; i >= 1; i--) {

            if (simpleNumber % i == 0 && i != 1) {
                System.out.println("It isn't a simple number");
                break;
            } else if (i == 1) {
                System.out.println("It is a simple number");
                break;
            }
        }
    }
}
