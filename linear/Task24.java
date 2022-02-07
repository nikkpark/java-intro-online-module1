package ru.hitchin.module1.linear;

/*
 * Задача 24.
 * Найти площадь равнобедренной трапеции
 * с основаниями a и b и углом α при большем основании a.
 */
public class Task24 {

    public static void main(String[] args) {
	task24();
    }
    
    public static void task24() {	
	double baseA;
	double baseB;
	double alpha;
	
	double areaOfTrapezium;
	
	baseA = 10;
	baseB = 6;
	alpha = 30; // degrees
	
	areaOfTrapezium = 0.5 * (Math.pow(baseA, 2) - Math.pow(baseB, 2))
			  * Math.tan(Math.toRadians(alpha));
	
	System.out.println("Area of the given trapezium: " + areaOfTrapezium);
    }
}
