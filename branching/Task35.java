package ru.hitchin.module1.branching;

/*
 * Задача 35.
 * Вычислить число и месяц в невисокосном году по номеру дня.
 */
public class Task35 {

    public static void main(String[] args) {
        task35(450);
        task35(4);
        task35(0);
        task35(166);
        task35(188);
        task35(59);
        task35(280);
        task35(311);
        task35(304);
    }

    public static void task35(int dayOfYear) {
        int day = 0;
        int month = 0;
        double quotient;

        quotient = dayOfYear / 30.0;

        if (dayOfYear > 365 || dayOfYear < 1) {
            System.out.println("Incorrect input.");
        } else {
            if (quotient < 1) {
                day = dayOfYear;
                month = (int) Math.ceil(quotient);
            } else if (quotient > 1 && quotient < 2) {
                day = dayOfYear - 31;
                month = (int) Math.ceil(quotient);
            } else if (quotient > 2 && quotient < 8) {
                month = (int) dayOfYear / 30;
                if ((int)((quotient - 2) % 2) != 0) {
                    day = (int) (dayOfYear - 31 - 28 - 31 * (Math.ceil((quotient - 2) / 2))
                          - 30 * Math.floor((quotient - 2) % 2));
                } else {
                    day = (int) (dayOfYear - 31 - 28 - 31 * (int) ((quotient - 2) / 2)
                            - 30 * (int) ((quotient - 2) / 2));
                }
                
            } else if (quotient > 7) {
                month = (int) dayOfYear / 30;
                
                if ((int)((quotient - 2) % 2) != 0) {                    
                    day = (int) (dayOfYear - 31 - 28 - 153 - 31 * (Math.ceil((quotient - 7) % 2))
                          - 30 * Math.floor((quotient - 7) / 2));
                } else {                    
                    day = (int) (dayOfYear - 31 - 28 - 153 - 31 * (int) Math.ceil(((quotient - 7) / 2))
                            - 30 * (int) ((quotient - 7) / 2));
                }
            }

            System.out.println(day + "." + month);
        }
    }
}
