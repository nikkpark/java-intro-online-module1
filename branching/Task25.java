package ru.hitchin.module1.branching;

/*
 * Задача 25.
 * Написать программу - модель анализа пожарного датчика в помещении,
 * которая выводит сообщение "Пожароопасная ситуация",
 * если температура в комнате превысила 60С.
 */
public class Task25 {

    public static void main(String[] args) {
	task25(4.5);
	task25(-500.2);
	task25(60.1);
    }
    
    public static void task25(double temperature) {
	System.out.println("Температура: " + temperature + "°C");
	if (temperature < -273.0) {
	    System.out.println("Ошибка. Недостижимая температура.");	    
	} else if (temperature > 60.0) {
	    System.out.println("Пожароопасная ситуация!");
	} else {
	    System.out.println("Продолжаю наблюдение.");
	}
	
	System.out.println();	
    }
}
