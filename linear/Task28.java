package ru.hitchin.module1.linear;

/*
 * Задача 28.
 * Составить программу перевода радианной меры угла
 * в градусы, минуты и секунды.
 */
public class Task28 {

    public static void main(String[] args) {
	task28();
    }
    
    public static void task28() {	
	double angleInRadians;
	
	double angleInDegrees;
	
	int degrees;
	int minutes;
	int seconds;
	
	angleInRadians = 1.5;
	
	angleInDegrees = angleInRadians * (180 / Math.PI);
	
	degrees = (int) angleInDegrees;
	minutes = (int) ((angleInDegrees - degrees) * 60);
	seconds = (int) ((((angleInDegrees - degrees) * 60) - minutes) * 60);	
	
	System.out.println(angleInRadians + " radians = "
			   + degrees + "° " + minutes + "' " + seconds + "\"");	
    }
}
