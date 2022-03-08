package ru.hitchin.module1.cycle;

/*
 * Задача 34.
 * Найдите все четырехзначные числа,
 * сумма цифр каждого из которых равна 15.
 */
public class Task34 {

    public static void main(String[] args) {
        task34();
    }
    
    public static void task34() {
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int forthDigit;
        int sum;
        int newLineTrigger;
        
        firstDigit = 0;
        secondDigit = 0;
        thirdDigit = 0;
        forthDigit = 0;
        sum = 0;
        
        for (int i = 1000;  i < 9601; i++) {
            newLineTrigger = firstDigit * 10 + secondDigit;
            firstDigit = i / 1000;
            secondDigit = i % 1000 / 100;
            thirdDigit = i % 1000 % 100 / 10;
            forthDigit = i % 10;
            
            sum = firstDigit + secondDigit + thirdDigit + forthDigit;
            
            if (newLineTrigger < firstDigit * 10 + secondDigit) {
                System.out.println();
            }
            
            if (sum == 15) {
                System.out.print(i + " ");
            }
            

        }       
    }
}
