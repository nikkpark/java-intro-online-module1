package ru.hitchin.module1.cycle;

/*
 * Задача 22.
 * Составить программу для вычисления значений функции
 * F(x) на отрезке [a, b] с шагом h.
 * Результат представить в виде таблицы,
 * первый столбец которой -- значения аргумента,
 * второй -- соответствующие значения функции.
 * F(x) = sin^2(x).
 */
public class Task22 {

    public static void main(String[] args) {
        task22(-2.0, 3.0, 0.5);
    }
    
    public static void task22(double a, double b, double step) {
        double fx;
        
        System.out.println("F(x) = sin^2(x)");
        System.out.println("-----------------");
        System.out.println("|   x   |  F(x) |");
        System.out.println("-----------------");
        
        for (double i = a; i <= b; i = i + step) {
            fx = Math.pow(Math.sin(i), 2);
            
            System.out.println(String.format("| % .1f  | % .3f|", i, fx));
            System.out.println("-----------------");
        }
    }
}
