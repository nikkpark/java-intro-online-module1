package ru.hitchin.module1.branching;

/*
 * Задача 12.
 * Даны три действительных числа.
 * Возвести в квадрат те из них, значения которых неотрицательны, 
 * а в четвертую степень - отрицательные. *
 */
public class Task12 {

    public static void main(String[] args) {
	task12(-12.1);
	task12(3.2);
	task12(-4.3);
    }
    
    public static void task12(double number) {
	System.out.println("Given number: " + number);
	if (number > 0) {
	    System.out.println(number + "^" + 2 + " = " + Math.pow(number, 2));
	} else if (number < 0) {
	    System.out.println(number + "^" + 4 + " = " + Math.pow(number, 4));
	}
    }
}
