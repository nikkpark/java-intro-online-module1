package ru.hitchin.module1.cycle;

/*
 * Задача 13.
 * Составить таблицу значений функции y = 5 - x^2 / 2
 * на отрезке [-5;5] с шагом 0.5.
 */
public class Task13 {

    public static void main(String[] args) {
        task13();
    }
    
    public static void task13() {
        int a;
        int b;
        double step;
        
        a = -5;
        b = 5;
        step = 0.5;
        
        System.out.println("y = 5 - x^2 / 2");
        System.out.println("x\ty");
        
        for (double x = a; x <= b; x = x + step) {
            System.out.println(x + "\t" + (5 - Math.pow(x, 2) / 2 ));
        }
    }

}
