package ru.hitchin.module1.cycle;

/*
 * Задача 17.
 * Даны действительное (а) и натуральное (n).
 * Вычислить a * (a + 1) * ... * (a + (n - 1)).
 */
public class Task17 {

    public static void main(String[] args) {
        task17(2.0, 3);
        task17(-3.0, 3);
        task17(0.0, 5);
        task17(9.0, -4);
    }
    
    public static void task17(double a, int n) {
        if (n < 1) {
            System.out.println("n = " + n + ". n must be natural.");
        } else {
            double product;
            double currentNumber;
            
            if (a == 0.0) {
                product = 0.0;
            } else {
                product = a;
            }
            
            currentNumber = 0;
            for (int i = 1; i < n; i++) {
                currentNumber = a + i;
                
                product = product * currentNumber;
            }
            
            System.out.println(product);            
        }
    }
}
