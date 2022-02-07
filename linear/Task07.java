package ru.hitchin.module1.linear;

/*
 * Задача 7.
 * Дан прямоугольник, ширина которого в два раза меньше длины.
 * Найти площадь прямоугольника.
 */
public class Task07 {

    public static void main(String[] args) {
	task07();
    }
    
    public static void task07() {
	double rectangleLength;
	double rectangleWidth;
	
	double areaOfRectangle;

	rectangleLength = 17.5;
	rectangleWidth = rectangleLength / 2.0;

	areaOfRectangle = rectangleWidth * rectangleLength;

	System.out.println("The area of the given rectangle: "
			   + areaOfRectangle);
    }
}
