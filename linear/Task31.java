package ru.hitchin.module1.linear;

/*
 * Задача 31.
 * Составить программу для вычисления пути,
 * пройденного лодкой, если ее скорость в стоячей воде v км/ч,
 * скорость течения реки v1 км/ч, время движения по озеру t1 ч,
 * а против течения реки t2 ч.
 */
public class Task31 {

    public static void main(String[] args) {
	task31();
    }
    
    public static void task31() {	
	double v;
	double v1;	
	double t1;
	double t2;
	
	double s1; // lake
	double s2; // river
	
	v = 20.0;
	v1 = 3.0;
	t1 = 0.5;
	t2 = 2.0;
	
	s1 = v * t1;
	s2 = (v - v1) * t2;
	
	System.out.println("Distance across the lake: " + s1);
	System.out.println("Distance across the river: " + s2);	
    }
}
