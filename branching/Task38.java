package ru.hitchin.module1.branching;

/*
 * Задача 38.
 * Вычислить значение функции:
 *         | x^2, если 0 <= x <= 3;
 * F(x) = <
 *         | 4,   если x > 3 или x < 0
 */
public class Task38 {

    public static void main(String[] args) {
        task38(2.3);
        task38(-3.4);
        task38(10.6);
    }
    
    public static void task38(double x) {
        double fx = 0.0;
        
        if (x >= 0 && x <= 3) {
            fx = Math.pow(x, 2);
        } else if (x > 3 || x < 0) {
            fx = 4;
        }
        
        System.out.println("F(" + x + ") = " + fx);      
    }
}
