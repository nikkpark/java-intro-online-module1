package ru.hitchin.module1.branching;

/*
 * Задача 32.
 * Написать программу, которая по заданным трем числам определяет,
 * является ли сумма каких-либо двух из них положительной.
 */
public class Task32 {

    public static void main(String[] args) {
	task32(2.3, -5.1, 4.4);
	task32(-2.3, -5.1, -4.4);
	task32(0.0, 0.0, 0.0);
    }
    
    public static void task32(double numA, double numB, double numC) {
	System.out.println(numA + " " + numB + " " + numC);	

	if (numA + numB > 0 || numB + numC > 0 || numA + numC > 0) {
	    System.out.println("There are positive sums.");
	} else {
	    System.out.println("No positive sums.");
	}
	
	System.out.println();
    }
}
