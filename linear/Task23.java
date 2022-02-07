package ru.hitchin.module1.linear;
/*
 * Задача 23.
 * Найти площадь кольца,
 * внутренний радиус которого равен r,
 * а внешний - R (R > r).
 */

public class Task23 {

    public static void main(String[] args) {
	task23();
    }
    
    public static void task23() {	
	double innerRadius;
	double outerRadius;
	
	double areaOfRing;
	
	innerRadius = 4.0;
	outerRadius = 5.0;
	
	areaOfRing = Math.PI * 
		     (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
	
	System.out.println("Area of the given ring: " + areaOfRing);
    }
}
