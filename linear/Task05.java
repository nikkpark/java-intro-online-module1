package ru.hitchin.module1.linear;

/*
 * Задача 5.
 * Составить алгоритм нахождения 
 * среднего арифметического двух чисел.
 */
public class Task05 {

    public static void main(String[] args) {
        task05();
    }

    public static void task05() {
        double a;
        double b;

        double arithmeticMean;

        a = 158.21;
        b = -44.0;

        arithmeticMean = (a + b) / 2.0;

        System.out.print("Arithmetic mean: " + arithmeticMean);
    }
}
