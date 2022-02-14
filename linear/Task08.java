package ru.hitchin.module1.linear;

/*
 * Задача 8.
 * Вычислить выражение по формуле
 * (все переменные принимают действительные значения)
 * ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
 *   - Math.pow(a, 3) * c + Math.pow(b, -2).
 */
public class Task08 {

    public static void main(String[] args) {
        task08();
    }

    public static void task08() {
        double a;
        double b;
        double c;

        double valueOfExpression;

        a = -0.003;
        b = 12.7;
        c = 5.1;

        valueOfExpression = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))
                / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(
                "The value of the given expression: " + valueOfExpression);
    }
}
