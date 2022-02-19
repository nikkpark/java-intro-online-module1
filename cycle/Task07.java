package ru.hitchin.module1.cycle;

/*
 * Задача 7.
 * Вычислить значение функции на отрезке [a, b] с шагом h:
 *      |  x, x > 2,
 * y = <
 *      | -x, x <= 2;
 */
public class Task07 {

    public static void main(String[] args) { 
        task07(-4, 8, 2);
        task07(-9, 9, 3);
        task07(-4, 8, -2);
    }
    
    public static void task07(int a, int b, int step) {
        if (step <= 0) {
            System.out.println("Step: " + step );
            System.out.println("Step must be a positive number. Abort.");
        } else {
            for (int x = a; x <= b; x = x + step) {
                if (x > 2) {
                    System.out.println("(x = " + x + ") y = x; y = " + x);                
                } else {
                    System.out.println("(x = " + x + ") y = -x; y = " + (-x));
                }
            }
        }
        System.out.println();
    }
}
