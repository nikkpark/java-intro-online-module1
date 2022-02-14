package ru.hitchin.module1.branching;

import java.util.Scanner;

/*
 * Задача 23.
 * Определить правильность даты, введенной с клавиатуры
 * (число - от 1 до 31, месяц - от 1 до 12).
 * Если введены некорректные данные, то сообщить об этом.
 */
public class Task23 {

    public static void main(String[] args) {
        task23();
    }

    public static void task23() {
        int day = 0;
        int month = 0;
        boolean isCorrect = false;

        while (!isCorrect) {
            day = enterFromConsole("Day: ");
            if (day < 1 || day > 31) {
                System.out.println("Incorrect input.");
                System.out.println("Must be 1 to 31.");
            } else {
                isCorrect = true;
            }

        }
        
        isCorrect = false;
        while (!isCorrect) {
            month = enterFromConsole("Month: ");
            if (month < 1 || month > 12) {
                System.out.println("Incorrect input.");
                System.out.println("Must be 1 to 12.");
            } else {
                isCorrect = true;
            }
        }

        System.out.println("Date: " + day + "." + month);
    }

    public static int enterFromConsole(String message) {
        int num;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print(message);
        }

        num = sc.nextInt();

        return num;
    }
}
