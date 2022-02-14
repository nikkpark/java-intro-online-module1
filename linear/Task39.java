package ru.hitchin.module1.linear;

/*
 * Задача 39. 
 * Дано действительное число х. Не пользуясь никакими другими
 * арифметическими операциями, кроме умножения, сложения и вычитания,
 * вычислите за минимальное число операций: 2x^4 - 3x^3 + 4x^2 - 5x + 6.
 */
public class Task39 {

    public static void main(String[] args) {
        task39();
    }

    public static void task39() {
        double x;

        x = 4.79;

        System.out.println("x = " + x + ":");
        System.out.print("2x^4 - 3x^3 + 4x^2 - 5x + 6 = ");
        System.out.println(x * (x * (x * (2 * x - 3) + 4) - 5) + 6); // 8
    }
}
