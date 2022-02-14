package ru.hitchin.module1.linear;

/*
 * Задача 11.
 * Вычислить периметр и площадь прямоугольного треугольника
 * по длинам a и b двух катетов.
 * S = 0.5 * (a * b)
 * P = a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b, 2))
 */
public class Task11 {

    public static void main(String[] args) {
        task11();
    }

    public static void task11() {
        double a;
        double b;
        double c; // hypotenuse

        double perimeterOfTriangle;
        double areaOfTriangle;

        /* Heronian triangle */
        a = 4.0;
        b = 3.0;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        perimeterOfTriangle = a + b + c;
        areaOfTriangle = 0.5 * (a * b);

        System.out.println(
                "Perimeter of the given triangle: " + perimeterOfTriangle);
        System.out.println("Area of the given triangle: " + areaOfTriangle);
    }
}
