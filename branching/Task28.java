package ru.hitchin.module1.branching;

/*
 * Задача 28.
 * Даны три числа a, b, c. Определить, какое из них равно d.
 * Если ни одно не равно d, то найти max(d - a, d - b, d - c).
 */
public class Task28 {

    public static void main(String[] args) {
        task28(1.0, 2.0, 3.0, 10.0);
        task28(1.0, 2.0, 3.0, -10.0);
        task28(10.2, 3.3, -10.2, 10.2);
        task28(1.1, 1.1, 1.1, 1.1);
    }

    public static void task28(double a, double b, double c, double d) {
        boolean anyEqual = false;

        System.out.println(a + " " + b + " " + c + " " + d);

        if (a == d) {
            System.out.print("a = ");
            anyEqual = true;
        }
        if (b == d) {
            System.out.print("b = ");
            anyEqual = true;
        }
        if (c == d) {
            System.out.print("c = ");
            anyEqual = true;
        }

        if (anyEqual) {
            System.out.println("d");
        }

        if (!anyEqual) {
            double maximal;
            maximal = findMaximal(a, b, c, d);
            System.out.println("No equals.");
            System.out.println("max(d - a, d - b, d - c) = " + maximal);
        }

        System.out.println();
    }

    public static double findMaximal(double a, double b, double c, double d) {
        double maximal;

        if (d - a > d - b) {
            maximal = d - a;
        } else {
            maximal = d - b;
        }

        if (maximal < d - c) {
            maximal = d - c;
        }

        return maximal;
    }
}
