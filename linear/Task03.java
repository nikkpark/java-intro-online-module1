package ru.hitchin.module1.linear;

/*
 * Задача 3.
 * Найдите значение функции z = 2 * x + (y - 2) * 5.
 */
public class Task03 {

    public static void main(String[] args) {
        task03();
    }

    public static void task03() {
        double x;
        double y;

        double z;

        x = -19.4;
        y = 6.1;

        z = 2 * x + (y - 2) * 5;

        System.out.println("z = 2 * x + (y - 2) * 5");
        System.out.println("z = " + z);
    }
}
