package ru.hitchin.module1.branching;


/*
 * Составить программу, которая опеределит по трем введенным сторонам,
 * является ли данный треугольник равносторонним. *
 */
public class Task09 {

    public static void main(String[] args) {
	task09(4.5, 4.5, 4.5);
	task09(4.2, 4.5, 4.5);
    }
    
    public static void task09(double sideA, double sideB, double sideC) {	
	boolean isTriangleEquilateral;
		
	if (sideA == sideB && sideB == sideC) {
	    isTriangleEquilateral = true;
	} else {
	    isTriangleEquilateral = false;
	}
	
	System.out.println("Sides: " + sideA + " " + sideB + " " + sideC);
	System.out.println("Equilateral triangle: " + isTriangleEquilateral);
	System.out.println();
    }
}
