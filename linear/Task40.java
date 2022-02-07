package ru.hitchin.module1.linear;

/*
 * Задача 40. 
 * Дано значение х. Получить значения
 * (1) -2x + 3x^2 - 4x^3 и (2) 1 + 2x + 3x^2 + 4x^3.
 * Позаботьтесть об экономии операций.
 */
public class Task40 {
    
    public static void main(String[] args) {
	task40();
    }
    
    public static void task40() {	
	double x;
	double valueOfFirstExpression;
	double valueOfSecondExpression;
	
	x = 5.21;
	
	valueOfFirstExpression = x * ((3 - 4 * x) * x - 2); // 5
	valueOfSecondExpression = x * (x *(4 * x + 3) + 2) + 1; // 6
	
	System.out.println("-2x + 3x^2 - 4x^3 = " + valueOfFirstExpression);
	System.out.println("1 + 2x + 3x^2 + 4x^3 = " + valueOfSecondExpression);
    }
}
