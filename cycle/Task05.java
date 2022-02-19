package ru.hitchin.module1.cycle;

/*
 * Задача 5.
 * С помощью оператора while напишите программу определения
 * суммы всех нечетных числе в диапазоне от 1 до 99 включительно.
 */
public class Task05 {

    public static void main(String[] args) {
        task05();
    }
    
    public static void task05() {
        int i = 0;
        int sumOfOdds = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                sumOfOdds = sumOfOdds + i;
            }
            
            i++;
        }
        System.out.println("Sum of odd numbers (1 to 99): " + sumOfOdds);
    }
}
