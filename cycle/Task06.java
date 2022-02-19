package ru.hitchin.module1.cycle;

import java.util.Scanner;

/*
 * Задача 6.
 * Напишите программу,
 * где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */
public class Task06 {

    public static void main(String[] args) {
        task06();
    }
    
    public static void task06() {
        int number;
        int sum;
        int reachedNumber;
        int threshold;
        
        threshold = Integer.MAX_VALUE;
        sum = 0;
        reachedNumber = 0;
        number = enterFromConsole("Enter your number: ");
        
        System.out.println("Maximum value of Integer type: " + threshold);
        
        for (int i = 1; i < number + 1; i++) {
            if (threshold - sum < (i)) {
                System.out.println("The next step (" + sum + " + " + i
                                    + ") will cause overflow");                
                break;
            } else {
                sum = sum + i;
                reachedNumber = i;
            }
        }
        System.out.println("Sum(1 to " + reachedNumber + ") = " + sum);
        System.out.println();
    }
    
    public static int enterFromConsole(String message) {
        int number;
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print(message);
        
        while (!sc.hasNextInt() || (number = sc.nextInt()) <= 0) {
            sc.nextLine();
            System.out.print("\n"+ message);
        }
        
        return number;
    }
}
