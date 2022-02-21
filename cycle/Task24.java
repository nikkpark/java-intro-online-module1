package ru.hitchin.module1.cycle;

/*
 * Задача 24.
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
 * Преобразовать его в другое число, цифры которого будут следовать
 * в обратном порядке по сравнению с введенным числом.
 */
public class Task24 {

    public static void main(String[] args) {
        task24(-1);
        task24(1);
        task24(1234);
        task24(123456789);
    }
    
    public static void task24(int n) {
        int sum;
        String nString;      
        
        sum = 0;
        
        if (n < 1) {
            System.out.println("n is " + n + ". n must be natural. Abort.\n");
        } else {
            System.out.println("Number: " + n);
            
            /* convert int to String */
            nString = String.valueOf(n);
            int[] nArray = new int[nString.length()];
            
            /* fill the array with ints */
            for (int i = 0; i < nString.length(); i++) {
                nArray[i] = nString.charAt(i) - '0';
            }
            
            /* print out reversed number */
            System.out.print("Reversed number: ");
            for (int i = (nArray.length); i > 0; i--) {
                System.out.print(i);
            }
            
            System.out.println();
            
            /* calculate sum of even digits */
            for (int i = 0; i < nArray.length; i++) {
                if ((i + 1) % 2 == 0) {
                    sum = sum + nArray[i];
                }
            }
            
            System.out.println("Sum of even digits: " + sum);
            System.out.println();
        }
    }
}
