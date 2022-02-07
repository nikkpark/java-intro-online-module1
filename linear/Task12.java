package ru.hitchin.module1.linear;

/*
 * Задача 12.
 * Вычислить расстояние между двумя точками с данными
 * координатами (x1, y1) и (x2, y2).
 * l = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))
 */
public class Task12 {

    public static void main(String[] args) {
	task12();
    }
    
    public static void task12() {	
	double x1;
	double x2;
	double y1;
	double y2;
	
	double length;
	
	x1 = -1.4;
	x2 = 3.0;
	y1 = 5.3;
	y2 = -4.9;
	
	length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	
	System.out.println("Length: " + length);	
    }
}
