package ru.hitchin.module1.cycle;

import java.util.Scanner;

/*
 * Задача 25.
 * Требуется определить факториал числа, которое ввел пользователь.
 */
public class Task25 {

    public static void main(String[] args) {
        task25();
    }
    
    static public void task25() {
        int number;
        int threshold;
        int factorial;
        int reachedNumber;
        
        number = enterFromConsole("Enter your number: ");
        threshold = Integer.MAX_VALUE;
        factorial = 1;
        reachedNumber = 0;
        
        for (int i = 1; i < (number + 1); i++) {
            if ((double) (threshold / factorial) < (double) i) {
                System.out.println("The next step (" + factorial + " * "
                        + i + ") will cause overflow");
                break;
            } else {
                factorial = factorial * i;
                reachedNumber = i;
            }
        }
        
        System.out.println(reachedNumber + "! = " + factorial);        
    }
    
    static public int enterFromConsole(String message) {
        int number;
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        
        while (!sc.hasNextInt() || (number = sc.nextInt()) <= -1) {
            sc.nextLine();
            System.out.println(message);
        }
        
        return number;
    }
}
