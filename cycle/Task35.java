package ru.hitchin.module1.cycle;

/*
 * Задача 35.
 * Найдите количество четных цифр
 * данного натурального числа.
 */
public class Task35 {
    public static void main(String[] args) {
        task35(1);
        task35(0);
        task35(12);
        task35(172839);
    }
    
   public static void task35(int number) {
        int evenCounter;
        
        evenCounter = 0;
        
        System.out.println("Given number: " + number);
        if (number < 1) {
            System.out.println("The number is not natural.");
            return;
        }
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                ++evenCounter;
            }
            number = (int) (number / 10);
        }
        
        System.out.println("Even digits: " + evenCounter);
   }
}
