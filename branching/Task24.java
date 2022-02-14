package ru.hitchin.module1.branching;


/*
 * Задача 24.
 * Составить программу, определяющую результат гадания на ромашке
 * "любит - не любит", взяв за исходное данное количество лепестков n.
 */
public class Task24 {

    public static void main(String[] args) {
	task24(3);
	task24(10);
	task24(0);
	task24(-1);
    }
    
    public static void task24(int petals) {
	System.out.println("Number of petals: " + petals);
	if (petals < 1) {
	    System.out.println("Must be positive number. Abort.");
	} else if ( petals % 2 == 0) {
	    System.out.println("Hates.");
	} else {
	    System.out.println("Loves.");
	}
	System.out.println();
    }

}
