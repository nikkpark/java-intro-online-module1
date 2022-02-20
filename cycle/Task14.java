package ru.hitchin.module1.cycle;

/*
 * Задача 14.
 * Дано натуральное n. Вычислить 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
public class Task14 {

    public static void main(String[] args) {
        task14(100);
        task14(10);
        task14(-2);
    }
    
    public static void task14(int n) {
        double sum;
        
        sum = 0.0;
        
        if (n < 1) {
            System.out.println("n is " + n +". n must be natural. Abort.");
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum + 1.0/i;
            }
            System.out.println("Sum of 1/1 to 1/" + n + " = " + sum);
            
        }       
    }
}
