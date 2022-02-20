package ru.hitchin.module1.cycle;

/*
 * Задача 11.
 * Составить программу нахождения разности кубов
 * первых двухсот чисел.
 */
public class Task11 {

    public static void main(String[] args) {
        task11();
    }
    
    public static void task11() {
        long difference;
        long threshold;
        int reachedNumber;
        
        difference = 0;
        threshold = Long.MIN_VALUE;
        reachedNumber = 0;
        
        System.out.println("Minimum value of Long type: " + threshold);
        
        for (long i = 1; i < 201; i++) {
            if (threshold - difference > Math.pow(i, 3)) {
                System.out.println("The next step (" + difference + " - "
                                    + i + "^3" + ") will cause overflow");                
                break;
            } else {
                difference = (long) (difference - Math.pow(i, 3));
                reachedNumber = (int) i;
            }
        }
        System.out.println("Difference of Cubes (1 to " + reachedNumber + ") = "
                            + difference);
        System.out.println();
    }
}
