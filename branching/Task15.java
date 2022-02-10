package ru.hitchin.module1.branching;

/*
 * Задача 15.
 * Даны действительные числа x и y, не равные друг другу.
 * Меньшее из этих двух чисел заменить половиной их суммы, 
 * а большее - их удвоенным произведением.
 */
public class Task15 {

    public static void main(String[] args) {
	task15(14.3, 15.8);
    }
    
    public static void task15(double numberX, double numberY) {
	double tmp; // to store one of the numbers;
	
	if (numberX < numberY) {
	    System.out.println(numberX + " < " + numberY);
	    
	    tmp = numberX;
	    numberX = (numberX + numberY) / 2.0;
	    numberY = tmp * numberY * 2;
	    
	    System.out.println("Half of sum: " + numberX);
	    System.out.println("Doubled product: " + numberY);

	} else {
	    System.out.println(numberY + " < " + numberX);
	    
	    tmp = numberY;
	    numberY = (numberX + numberY) / 2.0;
	    numberX = tmp * numberX * 2;
	    
	    System.out.println("Half of sum: " + numberY);
	    System.out.println("Doubled product: " + numberX);
	}
	
    }

}
