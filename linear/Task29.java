package ru.hitchin.module1.linear;

/*
 * Задача 29.
 * Найти в радианах (градусах) все углы треугольника со
 * сторонами a, b, c.
 */
public class Task29 {

    public static void main(String[] args) {
        task29();
    }

    public static void task29() {
        double a;
        double b;
        double c;

        double alphaRadians;
        double alphaDegrees;

        double betaRadians;
        double betaDegrees;

        double gammaRadians;
        double gammaDegrees;

        a = 5.0;
        b = 5.0;
        c = 5.0;

        alphaRadians = Math
                .acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))
                        / (2 * b * c));
        betaRadians = Math
                .acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))
                        / (2 * a * c));

        alphaDegrees = Math.toDegrees(alphaRadians);
        betaDegrees = Math.toDegrees(betaRadians);

        gammaDegrees = 180 - alphaDegrees - betaDegrees;
        gammaRadians = Math.toRadians(gammaDegrees);

        System.out.println("Alpha in degrees: " + alphaDegrees);
        System.out.println("Alpha in radians: " + alphaRadians);

        System.out.println("Beta in degrees: " + betaDegrees);
        System.out.println("Beta in radians: " + betaRadians);

        System.out.println("Gamma in degrees: " + gammaDegrees);
        System.out.println("Gamma in radians: " + gammaRadians);
    }
}
