package ru.hitchin.module1.linear;

/*
 * Задача 30.
 * Три сопротивления R1, R2, R3 соединены параллельно.
 * Найдите сопротивление соединения.
 */
public class Task30 {

    public static void main(String[] args) {
        task30();
    }

    public static void task30() {
        double r1;
        double r2;
        double r3;

        double r;

        r1 = 10.2;
        r2 = 1000.0;
        r3 = 0.005;

        r = 1 / (r1 * r2 * r3);

        System.out.println("R = " + r);
    }
}
