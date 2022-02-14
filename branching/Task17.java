package ru.hitchin.module1.branching;

/*
 * Задача 17.
 * Даны целые числа m, n.
 * Если числа равны, то заменить каждое из них одним и тем же числом,
 * равным большему из исходных, а если равно, то заменить числа нулями.
 */
public class Task17 {

    public static void main(String[] args) {
        task17(3.3, 3.5);
        task17(8.8, 6.2);
        task17(7.9, 7.9);
    }

    public static void task17(double numberM, double numberN) {
        System.out.println("M = " + numberM);
        System.out.println("N = " + numberN);

        if (numberM > numberN) {
            numberN = numberM;
        } else if (numberN > numberM) {
            numberM = numberN;
        } else {
            numberM = 0.0;
            numberN = 0.0;
        }

        System.out.println("M = " + numberM);
        System.out.println("N = " + numberN);
        System.out.println();
    }
}
