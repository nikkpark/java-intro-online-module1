package ru.hitchin.module1.branching;

/*
 * Задача 11.
 * Составить программу, которая определит площадь какого треугольника больше.
 */
public class Task11 {

    public static void main(String[] args) {
        task10(6.2, 1.5);
        task10(87.11, 101.0);
        task10(14.5, 14.5);
    }

    public static void task10(double areaOne, double areaTwo) {
        if (areaOne > areaTwo) {
            System.out.println("Area of the first triangle is bigger: "
                    + areaOne + " > " + areaTwo);
        } else if (areaTwo > areaOne) {
            System.out.println("Area of the second triangle is bigger: "
                    + areaTwo + " > " + areaOne);
        } else {
            System.out.println("Areas are equal: " + areaOne + " = " + areaTwo);
        }
    }
}
