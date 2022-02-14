package ru.hitchin.module1.branching;

/*
 * Задача 14.
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */
public class Task14 {

    public static void main(String[] args) {
	task14(45.0, 45.0);
	task14(120.1, 80.5);
	task14(30.12, 60.6);
    }
    
    public static void task14(double angleOne, double angleTwo) {
	System.out.println("First angle: " + angleOne);
	System.out.println("Second angle: " + angleTwo);

	if (180 - angleOne - angleTwo > 0) {
	    System.out.println("Triangle exists.");
	    if (angleOne == 90.0 || angleTwo == 90.0 
		    || (180 - angleOne - angleTwo) == 90.0) {
		System.out.println("Triangle is right.");
	    }
	} else {
	    System.out.println("Triangle does't exist.");
	}
	
	System.out.println();
    }
}
