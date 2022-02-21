package ru.hitchin.module1.cycle;

/*
 * Задача 23.
 * Составить программу для вычисления значений функции
 * F(x) на отрезке [a, b] с шагом h.
 * Результат представить в виде таблицы,
 * первый столбец которой -- значения аргумента,
 * второй -- соответствующие значения функции.
 * F(x) = ctg(x/3) + 0.5 * sin(x).
 */
public class Task23 {

    public static void main(String[] args) {
        task23(-2.0, 3.0, 0.5);
    }
    
    public static void task23(double a, double b, double step) {
        double fx;
        
        System.out.println("F(x) = ctg(x/3) + 0.5 * sin(x)");
        System.out.println("-----------------");
        System.out.println("|   x   |  F(x) |");
        System.out.println("-----------------");
        
        for (double i = a; i <= b; i = i + step) {
            fx = 1 / Math.tan(i / 3.0) + 0.5 * Math.sin(i);
            
            System.out.println(String.format("| % .1f  |% .3f |", i, fx));
            System.out.println("-----------------");
        }
    }
}
