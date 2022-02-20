package ru.hitchin.module1.cycle;

/*
 * Задача 19.
 * Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общи член ряда имеет вид:
 * an = 1 / 2^n + 1 / 3^n
 */
public class Task19 {

    public static void main(String[] args) {
        task19(3, 0.2);
        task19(0, 0.1);
    }
    
    public static void task19(int n, double e) {
        if (n < 1) {
            System.out.println("n = " + n + ". n must be natural.");
        } else {
            double currentNumber;
            double sum;
            
            currentNumber = 0.0;
            sum = 0.0;            
            
            for (int i = 1; i <= n; i++) {
                currentNumber = 1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i);
                if (currentNumber >= e ) {
                    sum = sum + currentNumber;
                }
            }
            
            System.out.println(sum);
        }
    }
}
