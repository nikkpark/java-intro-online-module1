package ru.hitchin.module1.branching;

/*
 * Задача 27.
 * Найти max{min(a, b), min(c,d)}
 */
public class Task27 {

    public static void main(String[] args) {
        task27(2.4, 3.6, 0.1, -1.8);
        task27(0.0, 0.0, 0.0, 0.0);
        task27(-2.8, -65.1, -9.3, -5.6);
    }

    public static void task27(double a, double b, double c, double d) {
        double result;

        result = findMaximal(findMinimal(a, b), findMinimal(c, d));

        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println("max{min(a, b), min(c,d)} = " + result);
        System.out.println();
    }

    public static double findMinimal(double a, double b) {
        double minimal;

        if (a < b) {
            minimal = a;
        } else {
            minimal = b;
        }

        return minimal;
    }

    public static double findMaximal(double a, double b) {
        double maximal;

        if (a > b) {
            maximal = a;
        } else {
            maximal = b;
        }

        return maximal;
    }
}
