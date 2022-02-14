package ru.hitchin.module1.linear;

/*
 * Задача 20.
 * Известна длина окружности.
 * Найти площадь круга, ограниченного этой окружностью.
 */
public class Task20 {

    public static void main(String[] args) {
        task20();
    }

    public static void task20() {
        double lengthOfCircumference;

        double areaOfCircle;

        lengthOfCircumference = 10.3;

        areaOfCircle = Math.pow(lengthOfCircumference, 2) / (4 * Math.PI);

        System.out.println("Area of the given circle: " + areaOfCircle);
    }
}
