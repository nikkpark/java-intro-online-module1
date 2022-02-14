package ru.hitchin.module1.linear;

/*
 * Задача 34.
 * Дана величина А, выражающая объем информации в байтах.
 * Перевести А в более крупные единицы измерения информации.
 */
public class Task34 {

    public static void main(String[] args) {
        task34();
    }

    public static void task34() {
        long someBytes;

        someBytes = 1099511627776L;

        System.out.println("bytes: " + someBytes);
        System.out.println("kb:    " + (int) (someBytes / Math.pow(1024, 1)));
        System.out.println("Mb:    " + (int) (someBytes / Math.pow(1024, 2)));
        System.out.println("Gb:    " + (int) (someBytes / Math.pow(1024, 3)));
        System.out.println("Tb:    " + (int) (someBytes / Math.pow(1024, 4)));
    }
}
