package ru.hitchin.module1.cycle;

/*
 * Задача 40.
 * Получить все числа, не превышающие заданного числа N,
 * которые делятся без остатка на все свои цифры.
 */
public class Task40 {
    public static void main(String[] args) {
        task40(100);
        task40(-10);
    }
    
    public static void task40(int threshold) {
        if (threshold < 1) {
            System.out.println("Number must be natural.");
            return;
        }
        
        for (int i = 1; i < threshold; i++) {
            boolean isDivisible = false;
            int digitIterator = i;
            int initialNumber = i;
            while (digitIterator > 0) {                
                if ((double) initialNumber % (digitIterator % 10) == 0) {
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
                
                digitIterator = digitIterator / 10;
            }
            
            if (isDivisible) {
                System.out.println(initialNumber);
            }
        }
    }
}

