package ru.hitchin.module1.cycle;

/*
 * Задача 16.
 * Вычислить (1 + 2) * (1 + 2 + 3) * ... * (1 + 2 + ... + 10).
 */
public class Task16 {

    public static void main(String[] args) {
        task16();
    }
    
    public static void task16() {
        long sum;
        long currentNumber;
        
        sum = 1;
        currentNumber = 0;
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                currentNumber = currentNumber + j;
            }
            sum = sum * currentNumber;
            currentNumber = 0;
        }
        
        System.out.println("(1 + 2) * (1 + 2 + 3) * ... * (1 + 2 + ... + 10) = "
                            + sum);
    }
}
