package com.yeliseyenka.lesson3;

/**
 * Задание:
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 * */

public class HomeWorkTask6 {
    public static void main(String[] args) {

        int lengthRectHole = 1;
        int widthRectHole = 1;
        int radRoundCardboard = 1;

        int diamRoundCardboard= radRoundCardboard * 2;

        if (Math.pow(diamRoundCardboard, 2) > (Math.pow(lengthRectHole, 2) + Math.pow(widthRectHole, 2))) {
            System.out.println("There's enough cardboard to close the hole");
        } else {
            System.out.println("There's not enough cardboard to close the hole");
        }
    }
}
