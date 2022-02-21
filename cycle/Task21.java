package ru.hitchin.module1.cycle;

/*
 * Задача 21.
 * Составить программу для вычисления значений функции
 * F(x) на отрезке [a, b] с шагом h.
 * Результат представить в виде таблицы,
 * первый столбец которой -- значения аргумента,
 * второй -- соответствующие значения функции.
 * F(x) = x - sin(x).
 */
public class Task21 {

    public static void main(String[] args) {
        task21(-3.0, 6.0, 1.0);
    }
    
    public static void task21(double a, double b, double step) {
        double fx;
        
        System.out.println("F(x) = x - sin(x)");
        System.out.println("-----------------");
        System.out.println("|   x   |  F(x) |");
        System.out.println("-----------------");
        
        for (double i = a; i <= b; i = i + step) {
            fx = i - Math.sin(i);
            
            System.out.println(String.format("| % .1f  | % .3f|", i, fx));
            System.out.println("-----------------");
        }
    }
}
