package ru.hitchin.module1.branching;

/*
 * Задача 6.
 * Составить программу: определения наибольшего из двух чисел a и b.
 */
public class Task06 {

    public static void main(String[] args) {
	task06(2.8, 3.6);
	task06(2.8, -3.6);
	task06(2.8, 2.8);
    }
    
    public static void task06(double numberA, double numberB) {	
	if (numberA > numberB) {
	    System.out.println(numberA + " > " + numberB);	   
	} else if (numberB > numberA) {
	    System.out.println(numberB + " > " + numberA);   

	} else {
	    System.out.println(numberA + " = " + numberB);
	}
    }
}
