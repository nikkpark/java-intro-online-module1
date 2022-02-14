package ru.hitchin.module1.linear;

/*
 * Задача 10.
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y))
 *  * Math.tg(x * y).
 */
public class Task10 {

    public static void main(String[] args) {
        task10();
    }

    public static void task10() {
        double x;
        double y;

        double valueOfExpression;

        x = 2.5;
        y = 0.33;

        valueOfExpression = (Math.sin(x) + Math.cos(y))
                / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

        System.out.println(
                "The value of the given expression: " + valueOfExpression);
    }
}
