package ru.hitchin.module1.branching;

/*
 * Задача 19.
 * Подсчитать количество положительных среди чисел a, b, c.
 */
public class Task19 {

    public static void main(String[] args) {
	task19(12.3, -4.5, 0.0);
	task19(12.3, 4.1, 0.05);
	task19(-1.4, -6.6, +0.0);
    }
    
    public static void task19(double numberA, double numberB, double numberC) {
	int count = 0;
	if (numberA > 0) {
	    count = count + 1;
	}
	if (numberB > 0) {
	    count = count + 1;
	}
	if (numberC > 0) {
	    count = count + 1;
	}
	
	System.out.println("Positive numbers: " + count);
    }
}
