package ru.hitchin.module1.linear;

/*
 * Задача 26.
 * Найти площадь треугольника,
 * две стороны которого равны a и b,
 * а угол между этими сторонами y.
 */
public class Task26 {

    public static void main(String[] args) {
        task26();
    }

    public static void task26() {
        double a;
        double b;
        double y;

        double areaOfTriangle;

        a = 5;
        b = 7;
        y = 30; // degrees

        areaOfTriangle = 0.5 * a * b * Math.sin(Math.toRadians(y));

        System.out.println("Area of the given triangle: " + areaOfTriangle);
    }
}
