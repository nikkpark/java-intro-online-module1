package ru.hitchin.module1.cycle;

/*
 * Задача 15.
 * Вычислить 1 + 2 + 4 + 8 + ... + 2^10.
 */
public class Task15 {

    public static void main(String[] args) {
        task15();
    }
    
    static public void task15() {
        int sum;
        
        sum = 0;
        
        for (int i = 1; i <= Math.pow(2, 10); i++) {
            sum = sum + (int) Math.pow(i, 2);
        }
        
        System.out.println("Sum of 1 to 2^10: " + sum);
    }
}
