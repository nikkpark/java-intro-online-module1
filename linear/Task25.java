package ru.hitchin.module1.linear;

/*
 * Вычислить корни квадратного уравнения
 * ax^2 + bx + c = 0 с заданными коэффициентами a, b, c
 * (предполагается, что а != 0 и дискриминант неотрицателен).
 */
public class Task25 {

    public static void main(String[] args) {
	task25();
    }
    
    public static void task25() {        
        double a;
        double b;
        double c;
        
        double discriminant;
        
        double x1;
        double x2;
        
        a = 1;
        b = 8;
        c = -9;
        
        discriminant = Math.pow(b, 2) - 4 * a * c;
        
        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);   
    }
}
