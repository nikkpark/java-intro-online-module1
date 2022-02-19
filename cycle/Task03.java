package ru.hitchin.module1.cycle;

/**
 * Задача 3.
 * Необходимо вывести на экран таблицу умножения на 3.
 */
public class Task03 {

    public static void main(String[] args) {
        task03(3);
    }
    
    public static void task03(int num) {
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.print(num + "\t");
        for (int i = 1; i < 10; i++) {
            System.out.print(num * i + "\t");
        }
        System.out.println("\n\n");
    }    

}
