package ru.hitchin.module1.linear;

/*
 * Задача 22.
 * Дано натуральное число T, которое представляет
 * длительность прошедшего времени в секундах.
 * Вывести данное значение длительности
 * в часах, минутах и секундах в форме HHч MMмин SSс.
 */
public class Task22 {

    public static void main(String[] args) {
	task22();
    }
    
    public static void task22() {	
	int time;
	
	int hours;
	int minutes;
	int seconds;
	
	String formattedTime;
	
	time = 12305;
	
	hours = time / 3600;
	minutes = (time % 3600) / 60;
	seconds = (time % 3600) % 60;
	
	
	formattedTime = String.format("%02dч %02dмин %02dс",
				      hours, minutes, seconds);	
	
	System.out.println(formattedTime);
    }
}
