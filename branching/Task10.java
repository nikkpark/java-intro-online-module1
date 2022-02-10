package ru.hitchin.module1.branching;

/*
 * Задача 10.
 * Составить программу, которая определит площадь какого круга меньше.
 *
 */
public class Task10 {

    public static void main(String[] args) {
	task10(10.9, 10.0);
	task10(10.0, 10.0);
	task10(10.1, 10.7);
    }
    
    public static void task10(double areaOne, double areaTwo) {
	if (areaOne < areaTwo) {
	    System.out.println("Area of the first cirle is smaller: "
		    	       + areaOne + " > " + areaTwo);
	} else if (areaTwo < areaOne) {
	    System.out.println("Area of the second cirle is smaller: "
		    	       + areaTwo + " > " + areaOne);
	} else {
	    System.out.println("Areas are equal: " + areaOne + " = " + areaTwo);
	}
    }
}
