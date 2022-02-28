package ru.hitchin.module1.cycle;

import java.util.Scanner;

/*
 * Задача 31.
 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
 * Человек пытается их угадать.
 * Программа должна выводить угаданные и неугаданные числа из тех,
 * что сгенерировала программа, а так же ошибочные числа пользователя.
 */
public class Task31 {

    public static void main(String[] args) {
        task31();
    }
    
    public static void task31() {
        int currentTry;
        boolean isCorrect;
        
        int [] generatedNumbers;
        int [] guessedNumbers;
        int [] userWrongGuesses;
        
        generatedNumbers = generateFiveNumbers();
        guessedNumbers = new int[5];
        userWrongGuesses = new int[5];
        
        for (int i = 0; i < 5; i++) {
            currentTry = enterFromConsole("Enter your guess: "); 
            isCorrect = false;
            
            for (int j = 0; j < 5; j++) {
                if (currentTry == generatedNumbers[j]) {
                    guessedNumbers[i] = currentTry;
                    generatedNumbers[j] = -1;
                    isCorrect = true;
                    System.out.println("Correct!");
                }
            }
            
            if (!isCorrect) {
                userWrongGuesses[i] = currentTry;
            }
        }
        
        boolean isEverythingGuessed = true;
        
        for (int i = 0; i < 5; i++) {
            if (generatedNumbers[i] != -1) {
                isEverythingGuessed = false;
            }
        }
        
        printResults(isEverythingGuessed,
                     generatedNumbers, guessedNumbers, userWrongGuesses);
    }
    
    public static int[] generateFiveNumbers() {
        int[] randomNumbers = new int[5];
        
        int uniqueNumberCounter;
        int randomNumber;        
        boolean isInArray;
        
        uniqueNumberCounter = 0;
        isInArray = false;
        
        while (uniqueNumberCounter < 5) {
            randomNumber = (int) ((Math.random()) * 16.0);
            
            for (int i = 0; i < randomNumbers.length; i++) {
                if (randomNumber == randomNumbers[i]) {
                    isInArray = true;
                    break;
                }
            }
            
            if (!isInArray && randomNumber != 0) {
                randomNumbers[uniqueNumberCounter] = randomNumber;
                uniqueNumberCounter = uniqueNumberCounter + 1;
            }
            
            isInArray = false;
        }
        System.out.println();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        
        return randomNumbers;
    }
    
    public static int enterFromConsole(String message) {
        int number;
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(message);
        }
        number = sc.nextInt();
        
        return number;
    }
    
    
    public static void printResults(boolean isEverythingGuessed,
                                    int[] generatedNumbers,
                                    int[] guessedNumbers,
                                    int[] userWrongGuesses) {
        if (isEverythingGuessed) {
            System.out.println("Congratulations! You have guessed all numbers.");
        } else {
            System.out.println("Sorry, you haven't guessed all numbers.");
        }
            
        System.out.print("Guessed numbers:");
        for (int i = 0; i < guessedNumbers.length; i++) {
            if (guessedNumbers[i] != 0) {
                System.out.print(" " + guessedNumbers[i]);
            }   
        }
        System.out.println();
        
        System.out.print("Unguessed numbers:");
        for (int i = 0; i < generatedNumbers.length; i++) {
            if (generatedNumbers[i] != -1) {
                System.out.print(" " + generatedNumbers[i]);
            }                
        }
        System.out.println();
        
        System.out.print("Your wrong guesses:");
        for (int i = 0; i < userWrongGuesses.length; i++) {
            if (userWrongGuesses[i] != 0) {
                System.out.print(" " + userWrongGuesses[i]);
            } 
        }
        System.out.println();
    }
}
