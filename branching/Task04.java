package ru.hitchin.module1.branching;

import java.util.Scanner;

/*
 * Задача 4.
 * Составить программу: равны ли два числа a и b?
 */
public class Task04 {

    public static void main(String[] args) {
	task04();
    }
    
    public static void task04() {
	double numberA;
	double numberB;
	
	numberA = enterFromConsole("Number a: ");
	numberB = enterFromConsole("Number b: ");
	
	if (numberA == numberB) {
	    System.out.println("a equals b");
	} else {
	    System.out.println("a doesn't equal b");
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
