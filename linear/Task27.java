package ru.hitchin.module1.linear;

/*
 * Задача 27.
 * Дано значение а. 
 * Не используя никаких функций и никаких операций, кроме умножения, 
 * получить значение a^8 за три операции и a^10 за четыре операции.
 */
public class Task27 {

    public static void main(String[] args) {
        task27();
    }

    public static void task27() {
        double a;
        double b;

        a = 2;

        a = a * 2; // 1
        a = a * a; // 2
        a = a * a; // 3

        System.out.println("a^8 = " + a);

        a = 2;
        b = a * 2; // 1

        a = b;
        a = a * a; // 2
        a = a * a; // 3
        a = a * b; // 4

        System.out.println("a^10 = " + a);
    }
}
