package com.yeliseyenka.lesson5;

/**
 * «адание:
 * »меетс€ целое число, определить €вл€етс€ ли это число простым, т.е.
 * делитс€ без остатка только на 1 и себ€.
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
