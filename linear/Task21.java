package ru.hitchin.module1.linear;

/*
 * Задача 21.
 * Дано действительное число R 
 * вида nnn.ddd (три числовых  разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа
 * и вывести полученное значение числа.
 */
public class Task21 {

    public static void main(String[] args) {
        task21();
    }

    public static void task21() {
        double number;

        int nnn;
        int ddd;

        number = 123.456;
        nnn = (int) (123.456 / 1.0);
        ddd = (int) ((number - nnn) * 1000);

        System.out.println("Reversed number: " + ddd + nnn);
    }
}
