package ru.hitchin.module1.linear;

/*
 * Задача 6.
 * Написать код для решения задачи. 
 * В n малых бидонах 80 л молока.
 * Сколько литров молока в m больших бидонах,
 * если в каждом большом бидоне на 12 л больше, чем в малом?
 */
public class Task06 {

    public static void main(String[] args) {
        task06();
    }

    public static void task06() {
        int smallChurns;
        int largeChurns;
        double milkInSmallChurns;
        double differencePerLargeChurn;

        double milkInLargeChurns;

        smallChurns = 8;
        largeChurns = 2;
        milkInSmallChurns = 80;
        differencePerLargeChurn = 12.0;

        milkInLargeChurns = largeChurns
                * (milkInSmallChurns / smallChurns + differencePerLargeChurn);

        System.out.println("Large milk churns contain: " + milkInLargeChurns);
    }
}
