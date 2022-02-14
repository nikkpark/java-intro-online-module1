package ru.hitchin.module1.linear;

/*
 * Задача 13.
 * Заданы координаты трех вершин треугольника
 * (x1, y1), (x2,y2), (x3, y3). 
 * Найти его периметр и площадь.
 * Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))
 */
public class Task13 {

    public static void main(String[] args) {
        task13();
    }

    public static void task13() {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;

        double lengthA;
        double lengthB;
        double lengthC;

        double perimeterOfTriangle;
        double halfOfPerimeter;
        double areaOfTriangle;

        x1 = 2.0;
        y1 = 3.0;
        x2 = -7.0;
        y2 = 1.0;
        x3 = 4.5;
        y3 = -2.1;

        lengthA = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        lengthB = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        lengthC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        perimeterOfTriangle = lengthA + lengthB + lengthC;
        halfOfPerimeter = perimeterOfTriangle / 2.0;

        /* Heron's formula */
        areaOfTriangle = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - lengthA)
                * (halfOfPerimeter - lengthB) * (halfOfPerimeter - lengthC));

        System.out.println(
                "Perimeter of the given triangle: " + perimeterOfTriangle);
        System.out.println("Area of the given triangle: " + areaOfTriangle);
    }
}
