package ru.hitchin.module1.linear;

/*
 * Задача 9.
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (a / c) * (b / d) - (a * b - c) / (c * d).
 */
public class Task09 {

    public static void main(String[] args) {
        task09();
    }

    public static void task09() {
        double a;
        double b;
        double c;
        double d;

        double valueOfExpression;

        a = 1.2;
        b = 6.61;
        c = 0.2;
        d = 3.5;

        valueOfExpression = (a / c) * (b / d) - (a * b - c) / (c * d);

        System.out.println(
                "The value of the given expression: " + valueOfExpression);
    }
}
