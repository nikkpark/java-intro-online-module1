package ru.hitchin.module1.branching;

/*
 * Задача 26.
 * Написать программу нахождения суммы
 * большего и меньшего из трех чисел.
 */
public class Task26 {

    public static void main(String[] args) {
	task26(2.3, 5.9, 4.1);
	task26(1.1, 1.1, 1.1);
	task26(3.5, 6.8, 3.5);
    }
    
    public static void task26(double a, double b, double c) {
	double minimalNumber;
	double maximalNumber;
		
	minimalNumber = findMinimal(a, b, c);
	maximalNumber = findMaximal(a, b, c);
	
	System.out.println(a + " " + b + " " + c);	
	System.out.println("min + max: " + minimalNumber + " + " + maximalNumber
			    + " = " + (minimalNumber + maximalNumber));
	System.out.println();
    }
    
    public static double findMinimal(double a, double b, double c) {
	double minimal;
	
	if (a < b) {
	    minimal = a;
	} else {
	    minimal = b;
	}
	
	if (minimal > c) {
	    minimal = c;
	}
	
	return minimal;
    }
    
    public static double findMaximal(double a, double b, double c) {
	double maximal;
	
	if (a > b) {
	    maximal = a;
	} else {
	    maximal = b;
	}
	
	if (maximal < c) {
	    maximal = c;
	}
	
	return maximal;
    }
}
