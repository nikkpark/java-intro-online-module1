package ru.hitchin.module1.branching;

/*
 * Задача 5.
 * Составить программу: определения наименьшего из двух чисел a и b.
 */
public class Task05 {

    public static void main(String[] args) {
        task05(3.3, 3.5);
        task05(8.1, 6.9);
        task05(5.4, 5.4);
    }

    public static void task05(double numberA, double numberB) {
        if (numberA < numberB) {
            System.out.println(numberA + " < " + numberB);
        } else if (numberB < numberA) {
            System.out.println(numberB + " < " + numberA);

        } else {
            System.out.println(numberA + " = " + numberB);
        }
    }
}
