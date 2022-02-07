package ru.hitchin.module1.linear;

/*
 * Задача 33.
 * Ввести любой символ и определить его порядковый номер,
 * а так же указать предыдущий и последующий символы.
 */
public class Task33 {

    public static void main(String[] args) {
	task33();
    }
    
    public static void task33() {	
	char ch;
	
	ch = 'y';
	
	System.out.println(ch + ": " + (int) ch);
	System.out.println((char)(ch - 1) + ": " + (int) (ch - 1));
	System.out.println((char)(ch + 1) + ": " + (int) (ch + 1));
    }
}
