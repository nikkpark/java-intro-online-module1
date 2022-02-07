package ru.hitchin.module1.linear;

/*
 * Задача 36.
 * Найти частное произведений четных и нечетных цифр
 * четырехзначного числа.
 */
public class Task36 {

    public static void main(String[] args) {
	task36();
    }
    
    public static void task36() {	
	int number;
	
	double quotient;
	
	number = 7394;
	
	quotient = (((number / 1000) * ((number % 100) / 10))) /
		   (double) (((number / 100) % 10) * (number % 10));
	
	System.out.println("Quotient: " + quotient);
    }
}
