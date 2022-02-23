package ru.hitchin.module1.cycle;

import java.util.Arrays;

/*
 * Задача 29.
 * Даны два числа. Определить цифры, входящие в запись как первого,
 * так и второго числа.
 */
public class Task29 {

    public static void main(String[] args) {
        task29(1234, 63137);
        task29(-1234, 6317);
        task29(162.34, 63.17);
        task29(94.4755, 19.9487);
    }
    
    public static void task29(double a, double b) {
        int intedA;
        int intedB;        
        int[] arrayA;
        int[] arrayB;        
        
        System.out.println(a + " " + b);
        
        intedA = washDouble(a);
        intedB = washDouble(b);
        
        arrayA = numberCrumbles(intedA);
        arrayB = numberCrumbles(intedB);
        
        arrayA = deduplicate(arrayA);
        arrayB = deduplicate(arrayB);

        compareArrays(arrayA, arrayB);        
    }
    
    public static int washDouble(double dirtyDouble) {
        int polishedInt;        
        String[] numberParts = new String[2];
        String glue;
        
        dirtyDouble = Math.abs(dirtyDouble);
        
        glue = String.valueOf(dirtyDouble);
        numberParts = glue.split("\\.");
        
        if (numberParts[1].equals("0")) {
            glue = numberParts[0];
        } else {
            glue = numberParts[0] + numberParts[1]; 
        }        
        
        polishedInt = Integer.parseInt(glue);
        
        return polishedInt;
    }
    
    public static int[] numberCrumbles(int numberToTatter) {
        int[] arrayForDigits = new int[0];
        
        while (numberToTatter != 0) {
            arrayForDigits = Arrays.copyOf(
                                arrayForDigits, arrayForDigits.length + 1);
            arrayForDigits[arrayForDigits.length - 1] = numberToTatter % 10;
            numberToTatter = numberToTatter / 10;
        }
        
        return arrayForDigits;      
    }
    
    public static int[] deduplicate(int[] dirtyArray) {
        int[] temp = new int[1];       
        
        Arrays.sort(dirtyArray);
        
        temp[0] = dirtyArray[0];
        
        for (int i = 1; i < dirtyArray.length; i++) {
            if (dirtyArray[i] != temp[temp.length - 1]) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = dirtyArray[i];
            }            
        }
        
        return temp;        
    }
    
    public static void compareArrays(int[] arrA, int[] arrB) {        
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    System.out.println(arrA[i] + " is in both numbers.");
                }
            }
        }
        
        System.out.println();
    }
}
