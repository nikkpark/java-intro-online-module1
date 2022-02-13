package ru.hitchin.module1.branching;

/*
 * Задача 30.
 * Даны действительные числа a, b, c. Удвоить эти числа, если a > b > c,
 * и заменить их абсолютными значениями, если это не так. *
 */
public class Task30 {

    public static void main(String[] args) {
	task30(12.5, 5.7, 2.1);
	task30(-1.1, -0.3, 5.2);
    }
    
    public static void task30(double a, double b, double c) {
	System.out.println(a + " " + b + " " + c);
	
	if (a > b && b > c) {
	    a = a * 2.0;
	    b = b * 2.0;
	    c = c * 2.0;	    
	    System.out.println(a + " " + b + " " + c);
	} else {
	    a = Math.abs(a);
	    b = Math.abs(b);
	    c = Math.abs(c);
	    System.out.println(a + " " + b + " " + c);
	}
	
	System.out.println();
    }
}
