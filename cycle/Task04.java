package ru.hitchin.module1.cycle;

/*
 * Задача 4.
 * С помощью оператора while напишите программу вывода
 * всех четных чисел в диапазоне от 2 до 100 включительно.
 */
public class Task04 {

    public static void main(String[] args) {
        task04();        
    }
    
    public static void task04() {
        int i = 1;
        while (i < 101) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            
            i++;
        }
    }
}
