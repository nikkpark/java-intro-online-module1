package ru.hitchin.module1.branching;

/*
 * Задача 8.
 * Составить программу нахождения наименьшего из квадратов двух чисел a и b.
 */
public class Task08 {

    public static void main(String[] args) {
	task08(2.3, 4.5);
	task08(5.6, 5.6);
	task08(9.0, 3.3);
    }
    
    public static void task08(double numberA, double numberB) {	
	if (Math.pow(numberA, 2) < Math.pow(numberB, 2)) {
	    System.out.println(numberA + " < " + numberB);
	    System.out.println(Math.pow(numberA, 2));	   
	} else if (Math.pow(numberB, 2) < Math.pow(numberA, 2)) {
	    System.out.println(numberB + " < " + numberA);
	    System.out.println(Math.pow(numberB, 2));
	} else {
	    System.out.println(numberA + " = " + numberB);
	    System.out.println(Math.pow(numberA, 2));
	}
	
	System.out.println();
    }
}
