package ru.hitchin.module1.linear;

/*
 * Задача 16.
 * Найдите произведение цифр заданного четырехзначного числа.
 */
public class Task16 {

    public static void main(String[] args) {
	task16();
    }
    
    public static void task16() {	
	int number;
	
	int sumOfDigits;
	
	number = 1234;
	
	sumOfDigits = (number / 1000) + ((number % 1000) / 100)
		      + (((number % 1000) % 100) / 10) + number % 10;
	
	System.out.println("Sum of the digits: " + sumOfDigits);
    }
}
