package ru.hitchin.module1.linear;

/*
 * Задача 15.
 * Написать программу, которая выводит
 * первые четыре степени числа PI.
 */
public class Task15 {

    public static void main(String[] args) {
        task15();
    }

    public static void task15() {
        System.out.println("PI^0: " + Math.pow(Math.PI, 0));
        System.out.println("PI^1: " + Math.pow(Math.PI, 1));
        System.out.println("PI^2: " + Math.pow(Math.PI, 2));
        System.out.println("PI^3: " + Math.pow(Math.PI, 3));
    }
}
