package ru.hitchin.module1.branching;

/*
 * Задача 20.
 * Определить, делителем каких чисел a, b, c является число к.
 *
 */
public class Task20 {

    public static void main(String[] args) {
	task20(4.4, 8.8, 3.1, 2.2);
	task20(25.0, 625.0, 80.0, 5.0);
    }
    
    public static void task20(double a, double b, double c, double k) {
	System.out.println("Numbers: " + a + " " + b + " " + c);
	System.out.print("Divider " + k + ":");
	
	if (a % k == 0.0) {
	    System.out.print(" " + a);
	}
	if (b % k == 0.0) {
	    System.out.print(" " + b);
	}
	if (c % k == 0.0) {
	    System.out.print(" " + c);
	}
	
	System.out.println();
	System.out.println();
    }
}
