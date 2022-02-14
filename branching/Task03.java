package ru.hitchin.module1.branching;

import java.util.Scanner;

/*
 * Задача 3.
 * Составить программу сравнения введенного числа а и цифры 3.
 * Вывести на экран слово "yes", если число а меньше 3,
 * если больше, то вывести слово "no".
 */
public class Task03 {

    public static void main(String[] args) {
        task03();
    }

    public static void task03() {
        double numberA;

        numberA = enterFromConsole("Number a: ");

        /* implicit type conversion */
        if (numberA < 3) {
            System.out.println("yes");
        } else if (numberA > 3) {
            System.out.println("no");
        } else {
            System.out.println("equal");
        }
    }

    public static double enterFromConsole(String message) {
        double value;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print(message);

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print(message);
        }

        value = sc.nextDouble();

        return value;
    }
}
