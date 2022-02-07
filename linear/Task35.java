package ru.hitchin.module1.linear;

/*
 * Задача 35.
 * Даны натуральные числа M и N.
 * Вывести старшую цифру дробной части
 * и младшую цифру целой части числа M/N.
 */
public class Task35 {

    public static void main(String[] args) {
	task35();
    }
    
    public static void task35() {	
	int m;
	int n;
	
	int sub;
	double quotient;
	
	m = 12314;
	n = 125;
	
	quotient = m / (double) n;
	
	sub = (int) (quotient);
	
	
	System.out.println("Integer digit: " + (int) (quotient % 10));
	System.out.println("Fractional digit: " + (int)((quotient - sub) * 10));	
    }
}
