package ru.hitchin.module1.branching;

import java.util.Scanner;


/*
 * Задача 21. -- ИСПРАВИТЬ!
 * Программа - льстец.
 * На экране высвечивается вопрос: "Кто ты: мальчик или девочка? Введи Д или М".
 * В зависимости от ответа на экране должен появиться текст
 * "Мне нравятся девочки!" или "Мне нравятся мальчики!".
 */
public class Task21 {

    public static void main(String[] args) {
	task21();
	task21();
    }
    
    public static void task21() {
	String sex;
	
	sex = enterFromConsole("Кто ты: мальчик или девочка? Введи Д или М");
	
	if (sex == "Д" || sex == "д") {
	    System.out.println("Мне нравятся мальчики!");	    
	}
	if (sex == "М" || sex == "м") {
	    System.out.println("Мне нравятся девочки!");
	}
    }
    
    public static String enterFromConsole(String message) {
	String sex = "Unknown";
	boolean notMatched;
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println(message);
	notMatched = true;
	sc.nextLine();
	while (!notMatched) {
	    sex = sc.next();
	    if (sex == "Д") {
		notMatched = false;
	    } else {
		sc.nextLine();
		System.out.println(message);
	    }
	}	
	return sex;
    }
}
