package ru.hitchin.module1.cycle;

/*
 * Задача 36.
 * Два двузначных числа, записанных одно за другим,
 * образуют четырехзначное число,
 * которое делится на их произведение. Найти эти числа.
 */
public class Task36 {
    public static void main(String[] args) {
        task36();
    }
    
    public static void task36() {
        int concoctedNumber;
        
        for (int i = 10; i < 100; i++) {            
            for (int j = 10; j < 100; j++) { 
                concoctedNumber = i * 100 + j;
                
                if (concoctedNumber % (i * j) == 0) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}

