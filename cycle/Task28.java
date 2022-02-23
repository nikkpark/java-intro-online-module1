package ru.hitchin.module1.cycle;

import java.util.Scanner;

/*
 * Задача 28.
 * Написать программу, в которой вводятся два операнда X и Y
 * из знак операции (+, -, /, *).
 * Вычислить результат Z в зависимости от знака.
 * Предусмотреть реакции на возможный неверный знак операции,
 * а также на ввод Y = 0 при делении.
 * Организовать возможность многократных вычислений
 * без перезагрузки программу (т.е. построить цикл).
 * В качестве символа прекращения вычислений принять '0'.
 */
public class Task28 {

    public static void main(String[] args) {
        task28();
    }
    
    public static void task28() {
        double firstNumber;
        double secondNumber;
        String sign;
        String[] rawExpression;
        boolean shouldExit;
        int status;

        
        rawExpression= new String[3];
        shouldExit = false;        
        
        while (!shouldExit) {            
            rawExpression = enterFromConsole("Let's calculate: ");
            status = verifyInput(rawExpression);
            
            if (status == -1) {
                shouldExit = true;
                System.out.println("Bye.");
                break;
            } else if (status == -2) {
                System.out.println("Incomplete expression.");
            } else if (status == 0) {
                firstNumber = Double.parseDouble(rawExpression[0]);
                sign = rawExpression[1];
                secondNumber = Double.parseDouble(rawExpression[2]);
                
                switch (sign) {
                case "+": System.out.println(firstNumber + secondNumber);
                break;
                case "-": System.out.println(firstNumber - secondNumber);
                break;
                case "/": System.out.println(firstNumber / secondNumber);
                break;
                case "*": System.out.println(firstNumber * secondNumber);
                break;
                }                
            } else {
                if (status / 100 != 0) {
                    System.out.println("First argument is not a number.");
                }
                
                if (status % 100 / 10 != 0) {
                    System.out.println("Wrong operation sign.");
                }
                
                if (status % 100 % 10 != 0) {
                    System.out.println("Second argument is not a number"
                                       + "or division by zero.");
                }
            }
            
        }
    }
    
    public static String[] enterFromConsole(String message) {
        String[] expression = new String[3];
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        
        expression = sc.nextLine().split(" ");
        
        return expression;
    }
    
    public static int verifyInput(String[] unverifiedInput) {
        int status = 0;
        
        if (unverifiedInput[0].equals("0") && unverifiedInput.length == 1) {
            status = -1;
        } else if (unverifiedInput.length < 3) {
            status = -2;
        } else {
        
            if (unverifiedInput.length > 1
                    && unverifiedInput[0].matches("[0-9.]+")) {
                status = status + 0;
            } else {
                status = status + 100;
            }
            
            if (unverifiedInput.length == 3
                    && unverifiedInput[1].matches("[+-/*.]")) {
                status = status + 0;
            } else {
                status = status + 10;
            }
            
            if (unverifiedInput.length == 3 
                    && unverifiedInput[2].equals("0")
                    && unverifiedInput[1].equals("/")) {
                status = status + 1;
            } else if (unverifiedInput.length == 3                    
                    && unverifiedInput[2].matches("[0-9.]+")) {
                status = status + 0;
            } else {
                status = status + 1;
            }
        }

        return status;
    }
}
