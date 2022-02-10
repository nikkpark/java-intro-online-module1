package ru.hitchin.module1.branching;

import java.util.Scanner;

/*
 * Задача 1.
 * Составить программу сравнения двух чисел 1 и 2.
 * Если 1 меньше 2 - вывести цифру 7, в противном случае - цифру 8.
 */
public class Task01 {

    public static void main(String[] args) {
	task01();
    }
    
    public static void task01() {
	double firstNumber;
	double secondNumber;
	
	firstNumber = enterFromConsole("First number: ");
	secondNumber = enterFromConsole("Second number: ");
	
	if (firstNumber > secondNumber) {
	    System.out.println("7");
	} else if (firstNumber < secondNumber) {
	    System.out.println("8");
	} else {
	    System.out.println("equal");
	}	
    }
    
    public static double enterFromConsole(String message) {
	double value;
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.print(message);
	
	while (!sc.hasNextDouble()) {
	    sc.nextLine();
	    System.out.print(message);
	}
	
	value = sc.nextDouble();
	
	return value;	
    }
}
