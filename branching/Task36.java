package ru.hitchin.module1.branching;

/*
 * Задача 36.
 * Вычислить значение функции:
 *         | x^2 - 3x + 9, если x <= 3;
 * F(x) = <
 *         | 1/(x^3 + 6),   если x > 3.
 */
public class Task36 {

    public static void main(String[] args) {
        task36(2.3);
        task36(0.0);
        task36(9.5);
        task36(Math.cbrt(-6));
    }
    
    public static void task36(double x) {
        double fx;
        
        if (x <= 3) {
            fx = Math.pow(x, 2) - 3.0 * x + 9.0; 
        } else {
             fx = 1.0 / (Math.pow(x, 3) + 6);
        }
         
         System.out.println("F(" + x + ") = " + fx);
    }        
}
