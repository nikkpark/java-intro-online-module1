package ru.hitchin.module1.cycle;

/*
 * Задача 9.
 * Найти сумму квадратов первых ста чисел.
 */
public class Task09 {

    public static void main(String[] args) {
        task09();
    }
    
    public static void task09() {
        int sum;
        int threshold;
        int reachedNumber;
        
        sum = 0;
        threshold = Integer.MAX_VALUE;
        reachedNumber = 0;
        
        System.out.println("Maximum value of Integer type: " + threshold);
        
        for (int i = 1; i < 101; i++) {
            if (threshold - sum < (i)) {
                System.out.println("The next step (" + sum + " + " + i
                                    + ") will cause overflow");                
                break;
            } else {
                sum = sum + (int) Math.pow(i, 2);
                reachedNumber = i;
            }
        }
        System.out.println("Sum of Squares (1 to " + reachedNumber + ") = "
                            + sum);
        System.out.println();
    }
}
