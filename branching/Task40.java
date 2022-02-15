package ru.hitchin.module1.branching;

/*
 * Задача 40.
 * Вычислить значение функции:
 *         | -x^3 + 9, если x <= 13;
 * F(x) = <
 *         | -3/(x + 1),   если x > 13.
 */
public class Task40 {

    public static void main(String[] args) {
        task40(2.0);
        task40(15.22);
        task40(-1.0);
    }
    
    public static void task40(double x) {
        double fx;
        
        if (x <= 13) {
            fx = Math.pow(-3, 3) + 9;
        } else {
            fx = -3 * (x + 1);
        }
        
        System.out.println("F(" + x + ") = " + fx);
    }
}
