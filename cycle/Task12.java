package ru.hitchin.module1.cycle;

/*
 * Задача 12.
 * Последовательность an строится так: a1 = 1, an = 6 + a(n-1)
 * для каждого n > 1. Составьте программу нахождения
 * произведения первых 10 членов этой последовательности.
 */
public class Task12 {

    public static void main(String[] args) {
        task12(-5);       
        task12(10);
    }
    
    public static void task12(int n) {
        int currentElement = 1;
        
        if (n < 1) {
            System.out.println("n is " + n + ". n must be > 1. Abort.\n");
        } else {
            System.out.print(currentElement);
            for (int i = 2; i <= n; i++) {
                currentElement = 6 + currentElement;
                System.out.print(" " + currentElement);
            }
        }
    }
}
