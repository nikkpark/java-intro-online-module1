package ru.hitchin.module1.linear;

/*
 * Задача 9.
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (a / c) * (b / d) - (a * b - c) / (c * d).
 * Можно упростить выражение: 1 / d
 */
public class Task091 {

    public static void main(String[] args) {
        task091();
    }

    public static void task091() {
        double d;

        double valueOfExpression;

        d = 3.5;

        valueOfExpression = 1 / d;

        System.out.println(
                "The value of the given expression: " + valueOfExpression);
    }
}
