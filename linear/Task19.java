package ru.hitchin.module1.linear;

/*
 * Задача 19.
 * Дана сторона равностороннего треугольника.
 * Найти площадь этого треугольника,
 * его высоту, радиусы вписанной и описанной окружностей.
 */
public class Task19 {

    public static void main(String[] args) {
        task19();
    }

    public static void task19() {
        double sideOfTriangle;

        double altitudeOfEquilTriangle;

        double inscribedCircumRadius;
        double circumscribedCircumRadius;

        double areaOfTriangle;

        sideOfTriangle = 4.4;

        altitudeOfEquilTriangle = sideOfTriangle * Math.sqrt(3) / 2.0;

        inscribedCircumRadius = sideOfTriangle / Math.sqrt(3) / 2.0;
        circumscribedCircumRadius = sideOfTriangle / Math.sqrt(3);

        areaOfTriangle = 0.5 * sideOfTriangle * altitudeOfEquilTriangle;

        System.out.println("Altitude of the given triangle: "
                + altitudeOfEquilTriangle);
        System.out.println("Radius of inscribed circumference: "
                + inscribedCircumRadius);
        System.out.println("Radius of circumscribed circumference: "
                + circumscribedCircumRadius);
        System.out.println("Area of the given triangle: " + areaOfTriangle);
    }
}
