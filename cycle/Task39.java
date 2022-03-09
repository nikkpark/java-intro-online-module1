package ru.hitchin.module1.cycle;

/*
 * Задача 39.
 * В трехзначном числе зачеркнули старшую цифру.
 * Когда полученное чисо умножили на 7, то получили исходное число.
 * Найдите это число.
 */
public class Task39 {
    public static void main(String[] args) {
        task39();
    }
    
    public static void task39() {
        for (int i = 101; i < 1000; i++) {
            if ((i % 100) * 7 == i) {
                System.out.println(i);
                break;
            }
        }
    }
}

