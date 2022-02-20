package ru.hitchin.module1.cycle;

/*
 * Задача 18.
 * Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общи член ряда имеет вид:
 * an = (-1)^(n-1) / n
 */
public class Task18 {

    public static void main(String[] args) {
        task18(5, 0.1);
        task18(0, 0.1);
    }
    
    public static void task18(int n, double e) {
        if (n < 1) {
            System.out.println("n = " + n + ". n must be natural.");
        } else {
            double currentNumber;
            double sum;
            
            currentNumber = 0.0;
            sum = 0.0;            
            
            for (int i = 1; i <= n; i++) {
                currentNumber = Math.abs(Math.pow(-1, (i - 1)) / 2.0);
                if (currentNumber >= e ) {
                    sum = sum + currentNumber;
                }
            }
            
            System.out.println(sum);
        }
    }
}
