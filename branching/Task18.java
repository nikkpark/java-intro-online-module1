package ru.hitchin.module1.branching;

/*
 * Задача 18.
 * Подсчитать количество отрицательных среди чисел a, b, c.
 */
public class Task18 {

    public static void main(String[] args) {
	task18(12.3, -4.5, 0.0);
	task18(12.3, 4.1, 0.05);
	task18(-1.4, -6.6, -0.0);
    }
    
    public static void task18(double numberA, double numberB, double numberC) {
	int count = 0;
	if (numberA < 0) {
	    count = count + 1;
	}
	if (numberB < 0) {
	    count = count + 1;
	}
	if (numberC < 0) {
	    count = count + 1;
	}
	
	System.out.println("Negative numbers: " + count);
    }
}
