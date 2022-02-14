package ru.hitchin.module1.linear;

/*
 * Задача 18.
 * Дана длина ребра куба.
 * Найти площадь грани, площадь полной поверхности куба,
 * объем этого куба.
 */
public class Task18 {

    public static void main(String[] args) {
        task18();
    }

    public static void task18() {
        double cubeEdge;

        double areaOfFace;
        double areaOfCube;
        double volumeOfCube;

        cubeEdge = 5.0;

        areaOfFace = Math.pow(cubeEdge, 2);
        areaOfCube = 6 * areaOfFace;
        volumeOfCube = Math.pow(cubeEdge, 3);

        System.out.println("Area of the face: " + areaOfFace);
        System.out.println("Area of the given cube: " + areaOfCube);
        System.out.println("Volume of the given cube: " + volumeOfCube);
    }
}
