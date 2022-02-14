package ru.hitchin.module1.branching;

import java.util.Scanner;

/*
 * Задача 2.
 * Составить программу сравнения двух чисел 1 и 2.
 * Если 1 меньше 2 - вывести на экран слово "yes",
 * в противном случае - слово "no".
 */
public class Task02 {

    public static void main(String[] args) {
        task02();
    }

    public static void task02() {
        double firstNumber;
        double secondNumber;

        firstNumber = enterFromConsole("First number: ");
        secondNumber = enterFromConsole("Second number: ");

        if (firstNumber > secondNumber) {
            System.out.println("yes");
        } else if (firstNumber < secondNumber) {
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
