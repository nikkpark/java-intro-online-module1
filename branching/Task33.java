package ru.hitchin.module1.branching;

/*
 * Задача 33.
 * Написать программу, которая по паролю будет определять уровень доступа
 * сотрудника к секретной информации в базе данных. Доступ к базе имеют
 * только шесть человек, разбитых на три группы по степени доступа.
 * Они имеют следующие пароли:
 * 9583, 1747 - доступны модули баз А, В, С;
 * 3331, 7922 - доступны модули баз В, С;
 * 9455, 8997 - доступен модуль базы С.
 */
public class Task33 {

    public static void main(String[] args) {
        task33(9583);
        task33(0000);
        task33(3331);
    }

    public static void task33(int password) {
        if (password == 9583 || password == 1747) {
            System.out.println("Access granted. Available bases: A, B, C.");
        } else if (password == 3331 || password == 7922) {
            System.out.println("Access granted. Available bases: B, C.");
        } else if (password == 9455 || password == 8997) {
            System.out.println("Access granted. Available bases: C.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
