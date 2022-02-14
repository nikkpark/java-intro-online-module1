package ru.hitchin.module1.branching;

/*
 * Задача 7.
 * Составить программу нахождения модуля выражения a * x * x + b * x + c
 * при заданных значениях a, b, c и x.
 */
public class Task07 {

    public static void main(String[] args) {
	task07(5.4, 30.1, 3.1, -2.0);
	task07(5.4, -30.1, 3.1, -2.0);
	task07(0.0, 0.0, 0.0, 0.0);
    }
    
    public static void task07(double a, double b, double c, double x) {	
	double valueOfExpression;
	double modulusOfExpression;
	
	valueOfExpression = a * x * x + b * x + c;
	
	if (valueOfExpression >= 0) {
	    modulusOfExpression = valueOfExpression;
	} else {
	    modulusOfExpression = -valueOfExpression;
	}
	
	System.out.println("Value of the given expression: "
			   + valueOfExpression);
	System.out.println("Modulus of the given expression: "
			   + modulusOfExpression);
	System.out.println();
    }
}
