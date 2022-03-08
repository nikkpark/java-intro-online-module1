package ru.hitchin.module1.cycle;

/*
 * Задача 33.
 * Найдите наибольшую цифру данного натурального числа.
 */
public class Task33 {

    public static void main(String[] args) {
        task33(0);
        task33(12);
        task33(333);
        task33(792828234);
    }
    
    public static void task33(int naturalNumber) {
        if (naturalNumber < 1) {
            System.out.println("Given number: " + naturalNumber);
            System.out.println(naturalNumber + " is not natural.");
        } else {
            int biggestDigit;
            
            biggestDigit = 0;
            
            System.out.println("Given number: " + naturalNumber);
            
            while (naturalNumber > 0) {
                if (naturalNumber % 10 > biggestDigit) {
                    biggestDigit = naturalNumber % 10;
                    naturalNumber = naturalNumber / 10;
                } else {
                    naturalNumber = naturalNumber / 10;
                }
            }            
            System.out.println("The biggest digit: " + biggestDigit);            
        }
        System.out.println();
    }
}
