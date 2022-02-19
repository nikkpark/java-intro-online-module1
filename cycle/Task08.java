package ru.hitchin.module1.cycle;

/*
 * Задача 9.
 * Вычислить значения функции на отрезке [a, b] с шагом h:
 *      | (x + c) * 2, x = 15,
 * y = <
 *      | (x - c) + 6, x != 15;
 */
public class Task08 {

    public static void main(String[] args) {
        task08(13, 17, 2.3, 1);
        task08(11, 20, 1.9, -2);
    }
    
    public static void task08(int a, int b, double c, int step) {
        if (step <= 0) {
            System.out.println("Step: " + step );
            System.out.println("Step must be a positive number. Abort.");
        } else {
            for (int x = a; x <= b; x = x + step) {
                if (x == 15) {
                    System.out.println("(x = " + x + ") y = (x + c) * 2; y = "
                                        + ((x + c) * 2));                
                } else {
                    System.out.println("(x = " + x + ") y = (x - c) + 6; y = "
                                        + (x - c + 6));
                }
            }
        }
        System.out.println();
    }

}
