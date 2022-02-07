package ru.hitchin.module1.linear;
/*
 * Задача 17.
 * Даны два числа. 
 * Найти среднее арифметическое кубов этих чисел
 * и среднее геометрическое модулей этих чисел.
 */

public class Task17 {

    public static void main(String[] args) {
	task17();
    }
    
    public static void task17() {	
	double a;
	double b;
	
	double arithmeticMean;
	double geometricMean;
	
	a = -3.4;
	b = 7.1;
	
	arithmeticMean = (Math.pow(a, 3) + Math.pow(b, 3)) / 2.0;
	geometricMean = Math.sqrt(Math.abs(a) * Math.abs(b));
	
	System.out.println("Arithmetic mean: " + arithmeticMean);
	System.out.println("Geometric mean: " + geometricMean);	
    }
}
