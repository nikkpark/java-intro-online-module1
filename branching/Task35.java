package ru.hitchin.module1.branching;

/*
 * Задача 35.
 * Вычислить число и месяц в невисокосном году по номеру дня.
 */
public class Task35 {

    public static void main(String[] args) {
        task35(340);
        task35(57);
        task35(0);
        task35(599);
    }

    public static void task35(int numberOfDay) {
        int day;
        int month;

        if (numberOfDay > 365) {
            System.out.println("Incorrect input. Abort.");
        } else {

        }
    }
}
