package ru.hitchin.module1.linear;

/*
 * Задача 14.
 * Вычислить длину окружности и площадь круга
 * одного и того же заданного радиуса R. 
 * l = 2 * Math.PI * radius
 * S = Math.PI * Math.pow(r, 2);
 */
public class Task14 {

    public static void main(String[] args) {
	task14();
    }
    
    public static void task14() {	
	double radius;
	
	double lengthOfCircumference;
	double areaOfCircle;
	
	radius = 5.0;
	
	lengthOfCircumference = 2 * Math.PI * radius;
	areaOfCircle = Math.PI * Math.pow(radius, 2);
	
	System.out.println("Length of the given circumference: "
			   + lengthOfCircumference);
	System.out.println("Area of the given circle: " + areaOfCircle);	
    }
}
