package ru.hitchin.module1.branching;

/*
 * Задача 22.
 * Перераспределить значения переменных x и y так,
 * чтобы в x оказалось большее из этих значений,
 * а в у - меньшее.
 */
public class Task22 {

    public static void main(String[] args) {
        task22(2.4, 5.9);
        task22(0.0, -0.1);
    }

    public static void task22(double x, double y) {
        double tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if (x < y) {
            tmp = x;
            x = y;
            y = tmp;
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();
    }
}
