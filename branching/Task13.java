package ru.hitchin.module1.branching;

/*
 * Задача 13.
 * Даны две точки A(x1, y1) и B(x2, y2).
 * Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат.
 */
public class Task13 {

    public static void main(String[] args) {
        task13(2, -2, 4, 1);
        task13(5, -6, 3, 4);
        task13(9, 4, 4, 9);
    }

    public static void task13(int x1, int y1, int x2, int y2) {
        double firstPointDistance;
        double secondPointDistance;

        firstPointDistance = Math.sqrt((Math.pow(x1, 2) + Math.pow(y1, 2)));
        secondPointDistance = Math.sqrt((Math.pow(x2, 2) + Math.pow(y2, 2)));

        System.out.println("First point:  (" + x1 + ", " + y1 + ")");
        System.out.println("Second point: (" + x2 + ", " + y2 + ")");

        if (firstPointDistance < secondPointDistance) {
            System.out.println("First point is closer to the origin.");
        } else if (firstPointDistance > secondPointDistance) {
            System.out.println("Second point is closer to the origin.");
        } else {
            System.out.println("Points are equidistant.");
        }

        System.out.println();
    }
}
