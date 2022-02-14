package ru.hitchin.module1.branching;

/*
 * Задача 31.
 * Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task31 {

    public static void main(String[] args) {
        task31(5.6, 3.1, 5.3, 3.3, 12.3);
        task31(10.4, 7.7, 5.3, 3.3, 12.3);
    }

    public static void task31(double a, double b, double x, double y,
            double z) {
        if ((x <= a && y <= b) || (y <= a && x <= b) || (x <= a && z <= b)
                || (z <= a && x <= b) || (y <= a && z <= b)
                || (z <= a && y <= b)) {
            System.out.println("Fits.");
        } else {
            System.out.println("Doesn't fit.");
        }
    }
}
