package ru.hitchin.module1.cycle;

/*
 * Задача 38.
 * Для заданного натурального числа определить,
 * образуют ли его цифры арифметическую прогрессию.
 * Предполагается. что в числе не менее трех цифр.
 * Например: 1357, 963
 */
public class Task38 {
    public static void main(String[] args) {
        task38(1234567);
        task38(12345567);
        task38(12);
        task38(642);
    }
    
    public static void task38(int number) {
        int d;
        boolean isProgression;
        
        System.out.println(number);
        
        if (number < 100) {
            System.out.println("Number must be at least 3 digit long.\n");
            return;
        }
        
        d = number % 10 - number % 100 / 10;
        isProgression = false;
        
        while (number > 10) {
            if (number % 10 - number % 100 / 10 == d) {
                isProgression = true;
            } else {
                isProgression = false;
                break;
            }
            
            number = number / 10;
        }
        
        System.out.println(isProgression);
        
        if (isProgression) {
            System.out.print("d = " + d + "\n");
        }
        System.out.println();
    }
}

