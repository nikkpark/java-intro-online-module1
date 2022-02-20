package ru.hitchin.module1.cycle;

/*
 * Задача 10.
 * Составить программу нахождения произведения квадратов
 * первых двухсот чисел.
 */
public class Task10 {

    public static void main(String[] args) {
        task10();
    }
    
    public static void task10() {
        long product;
        long threshold;
        int reachedNumber;
        
        product = 1;
        threshold = Long.MAX_VALUE;
        reachedNumber = 0;
        
        System.out.println("Maximum value of Long type: " + threshold);
        
        for (long i = 1; i < 201; i++) {
            if (threshold / product < Math.pow(i, 2)) {
                System.out.println("The next step (" + product + " * "
                                    + i + "^2" + ") will cause overflow");                
                break;
            } else {
                product = (long) (product * Math.pow(i, 2));
                reachedNumber = (int) i;
            }
        }
        System.out.println("Product of Squares (1 to " + reachedNumber + ") = "
                            + product);
        System.out.println();
    }
}
