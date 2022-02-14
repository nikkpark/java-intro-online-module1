package ru.hitchin.module1.branching;

/*
 * Задача 16.
 * На плоскости XOY задана своими координатами точка А.
 * Указать, где она расположена
 * (на какой оси или в каком координатном угле).
 */
public class Task16 {

    public static void main(String[] args) {
        task16(1, 0);
        task16(0, 1);
        task16(0, 0);
        task16(1, 1);
        task16(-1, 1);
        task16(-1, -1);
        task16(1, -1);
    }

    public static void task16(int x, int y) {
        System.out.println("Point: (" + x + ", " + y + ")");

        if (x == 0 && y == 0) {
            System.out.println("The point is in the origin.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point is on the abscissa.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point is on the ordinate.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the forth quadrant.");
        }

        System.out.println();
    }

}
