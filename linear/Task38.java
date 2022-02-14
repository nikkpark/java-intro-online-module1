package ru.hitchin.module1.linear;

/*
 * Задача 38.
 * Для данных областей составить линейную программу,
 * которая печатает true, если точка с координатами (x, y)
 * принадлежит закрашенной области, и false - в противном случае.
 */
public class Task38 {

    public static void main(String[] args) {
        task38a();
        task38b();
        task38c();
    }

    public static void task38a() {
        /*
         * y = x + 4 y = -x + 4 x ∈ [-4; 4] y ∈ [0; 4]
         */

        int x;
        int y;

        boolean isInside;

        x = -2;
        y = 1;

        isInside = (y + Math.abs(x) <= 4 && y >= 0);

        System.out.println("38a: " + isInside);
    }

    public static void task38b() {
        /*
         * x ∈ [-4; 4] y ∈ [-3; 4]
         */

        int x;
        int y;

        boolean isInside;

        x = 0;
        y = -2;

        isInside = ((y >= 0 && y <= 4 && x >= -2 && x <= 2)
                || (y <= 0 && y >= -3 && x <= 4 && x >= -4));

        System.out.println("38b: " + isInside);
    }

    public static void task38c() {
        /*
         * r^2 = x^2 + y^2 16 = x^2 + y^2 25 = x^2 + y^2
         */

        int x;
        int y;

        boolean isInside;

        x = 3;
        y = 1;

        isInside = (((x * x + y * y <= 16) && y >= 0 && x >= 0)
                || ((x * x + y * y <= 25) && y <= 0 && x >= 0));

        System.out.println("38c: " + isInside);
    }
}
