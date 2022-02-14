package ru.hitchin.module1.branching;

/*
 * Задача 29.
 * Даны три точки A(x1, y1), B(x2, y2), C(x3,y3).
 * Определить, будут ли они расположены на одной прямой.
 */
public class Task29 {

    public static void main(String[] args) {
        task29(2.2, 3.1, -2.6, 4.7, 5.05, 6.22);
        task29(-2.0, 1.0, 0.0, 3.0, -7.0, -4.0);
    }

    static public void task29(double x1, double y1, double x2, double y2,
            double x3, double y3) {

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
