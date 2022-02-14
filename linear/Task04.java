package ru.hitchin.module1.linear;

/*
 * Задача 4.
 * Найдите значение функции z = ((a - 3) * b / 2) + c.
 */
public class Task04 {

    public static void main(String[] args) {
        task04();
    }

    public static void task04() {
        double a;
        double b;
        double c;

        double z;

        a = 19.6;
        b = -3.15;
        c = 0.01;

        z = ((a - 3) * b / 2.0) + c;

        System.out.println("z = ((a - 3) * b / 2) + c");
        System.out.println("z = " + z);
    }
}
