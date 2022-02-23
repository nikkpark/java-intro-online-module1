package ru.hitchin.module1.cycle;

import java.util.Scanner;

/*
 * Задача 27.
 * Для каждого натурального числа в промежутке от m до n
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task27 {

    public static void main(String[] args) {
        task27();
    }
    
    public static void task27() {
        int m;
        int n;
        boolean notSatisfied;
        
        notSatisfied = true;
        m = enterFromConsole("Enter number m: ");
        n = enterFromConsole("Enter number n: ");
        
        
        while (notSatisfied) {
            if (m >= n || m < 0 || n < 0) {
                System.out.println("m and n - natural numbers. "
                                    + "m must be less than n.");
                m = enterFromConsole("Enter number m: ");
                n = enterFromConsole("Enter number n: ");
            } else {
                notSatisfied = false;
            }

        }
        
        for (int i = m; i < (n + 1); i++) {
            System.out.print(i + ":");
            
            for (int j = (i - 1); j > 1; j --) {
                if (i % j == 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();            
        }        
    }
    
    public static int enterFromConsole(String message) {
        int num;
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(message);
        }
        
        num = sc.nextInt();
        
        return num;
    }
}
