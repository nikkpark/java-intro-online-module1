package ru.hitchin.module1.branching;

/*
 * Задача 39.
 * Вычислить значение функции:
 *         | -x^2 + x - 9, если x >= 8;
 * F(x) = <
 *         | 1/(x^4 - 6),   если x < 8.
 */
public class Task39 {

    public static void main(String[] args) {
        task39(2.3);
        task39(8.0);
        task39(9.5);
        task39(Math.sqrt(Math.sqrt(6)));
    }
    
    public static void task39(double x) {
        double fx;        

        if (x >= 8) {
            fx = Math.pow(-x, 2) + x - 9.0; 
        } else {
             fx = 1.0 / (Math.pow(x, 4) - 6);
        }
         
         System.out.println("F(" + x + ") = " + fx);
    }        
}
