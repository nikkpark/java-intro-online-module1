package ru.hitchin.module1.linear;

/*
 * Задача 1. 
 * Даны два действительных числа x и y. 
 * Вычислить их сумму, разность, произведение и частное.
 */
public class Task01 {

    public static void main(String[] args) {
	task01();
    }
    
    public static void task01() {
	double x;
	double y;
	
	double total;
	double difference;
	double product;
	double quotient;
	double reminder;

	x = 3.1;
	y = -5.8;

	total = x + y;
	difference = x - y;
	product = x * y;
	quotient = x / y;
	reminder = x % y;

	System.out.println("total = " + total);
	System.out.println("difference = " + difference);
	System.out.println("product = " + product);
	System.out.println("quotient = " + quotient);
	System.out.println("reminder = " + reminder);
    }
}
