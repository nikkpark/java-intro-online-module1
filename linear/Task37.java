package ru.hitchin.module1.linear;

/*
 * Задача 37.
 * Составить линейную программу, печатающую значение true,
 * если указанное высказывание является истинным,
 * и false - в противном случае:
 *
 * a) Целое число N является четным двузначным числом.
 *
 * b) Сумма двух первых цифр заданного четырехзначного числа
 *    равна сумме двух его последних цифр.
 *  
 * c) Сумма цифр данного трехзначного числа N является
 *    четным числом.
 *  
 * d) Точка с координатами (x,y) принадлежит части плоскости,
 *    лежащей между прямыми x = m, x = n (m < n).
 * 
 * e) Квадрат заданного трехзначного числа равен кубу суммы
 *    цифр этого числа.
 * 
 * f) Треугольник со сторонами a, b, c является равнобедренным.
 *
 * g) Сумма каких-либо двух цифа заданного трехзначного 
 *    натурального числа N равна третьей цифре.
 *  
 * h) Заданное число N является степенью числа а
 *    (показатель степени может находиться в диапазоне от 0 до 4.
 * 
 * i) График функции y = ax^2 + bx + c проходит через
 *    заданную точку с координатами (m, n).
 */
public class Task37 {

    public static void main(String[] args) {
        task37a();
        task37b();
        task37c();
        task37d();
        task37e();
        task37f();
        task37g();
        task37h();
        task37i();
    }

    public static void task37a() {
        /*
         * a) Целое число N является четным двузначным числом.
         */

        int twoDigitNumber;

        boolean isEvenTwoDigitNumber;

        twoDigitNumber = -98;

        isEvenTwoDigitNumber = ((twoDigitNumber % 2 == 0)
                && ((twoDigitNumber / 100 == 0) && (twoDigitNumber / 10 != 0)));

        System.out.println("37a: " + isEvenTwoDigitNumber);
    }

    public static void task37b() {
        /*
         * b) Сумма двух первых цифр заданного четырехзначного числа равна сумме
         *    двух его последних цифр.
         */

        int someDigitNumber;
        int leftSum;
        int rightSum;

        boolean isFourDigitNumber;
        boolean areSumsEqual;

        someDigitNumber = Math.abs(1109);

        isFourDigitNumber = (someDigitNumber / 1000 != 0);

        leftSum = someDigitNumber / 1000 + (someDigitNumber / 100) % 10;
        rightSum = (someDigitNumber % 100) / 10 + (someDigitNumber % 100) % 10;

        areSumsEqual = (isFourDigitNumber && (leftSum == rightSum));

        System.out.println("37b: " + areSumsEqual);
    }

    public static void task37c() {
        /*
         * c) Сумма цифр данного трехзначного числа N является четным числом.
         */

        int someDigitNumber;
        int sumOfDigits;

        boolean isThreeDigitNumber;
        boolean isSumEven;

        someDigitNumber = Math.abs(-103);

        isThreeDigitNumber = (someDigitNumber / 100 != 0);

        sumOfDigits = someDigitNumber / 100 + someDigitNumber % 100 / 10
                + someDigitNumber % 100 % 10;

        isSumEven = (isThreeDigitNumber && (sumOfDigits) % 2 == 0);

        System.out.println("37c: " + isSumEven);
    }

    public static void task37d() {
        /*
         * d) Точка с координатами (x,y) принадлежит части плоскости, лежащей
         * между прямыми x = m, x = n (m < n).
         */

        double x;
        double m;
        double n;

        boolean isInBetween;

        x = 7.99;
        m = 2.0;
        n = 8.0;

        isInBetween = ((x > m) && (x < n));

        System.out.println("37d: " + isInBetween);
    }

    public static void task37e() {
        /*
         * e) Квадрат заданного трехзначного числа равен кубу суммы цифр этого
         * числа.
         */

        int someDigitNumber;
        int digitOne;
        int digitTwo;
        int digitThree;

        double squareOfNumber;
        double cubeOfDigitsSum;

        boolean isThreeDigitNumber;
        boolean areTheyEqual;

        someDigitNumber = 123; // какое же такое это число, когда они равны?!

        isThreeDigitNumber = (someDigitNumber / 100 != 0);

        squareOfNumber = Math.pow(someDigitNumber, 2);

        digitOne = someDigitNumber / 100;
        digitTwo = someDigitNumber % 100 / 10;
        digitThree = someDigitNumber % 100 % 10;

        cubeOfDigitsSum = Math.pow(digitOne, 3) + Math.pow(digitTwo, 3)
                + Math.pow(digitThree, 3) + 3 * Math.pow(digitOne, 2) * digitTwo
                + 3 * Math.pow(digitOne, 2) * digitThree
                + 3 * digitOne * Math.pow(digitTwo, 2)
                + 3 * digitOne * Math.pow(digitThree, 2)
                + 3 * Math.pow(digitTwo, 2) * digitThree
                + 3 * digitTwo * Math.pow(digitThree, 2)
                + 6 * digitOne * digitTwo * digitThree;

        areTheyEqual = (isThreeDigitNumber
                && (squareOfNumber == cubeOfDigitsSum));

        System.out.println("37e: " + areTheyEqual);
    }

    public static void task37f() {
        /*
         * f) Треугольник со сторонами a, b, c является равнобедренным.
         */

        double sideA;
        double sideB;
        double sideC;

        boolean isIsoscelesTriangle;

        sideA = 3.4;
        sideB = 4.5;
        sideC = 3.0;

        isIsoscelesTriangle = ((sideA == sideB) || (sideB == sideC)
                || (sideA == sideC));

        System.out.println("37f: " + isIsoscelesTriangle);
    }

    public static void task37g() {
        /*
         * g) Сумма каких-либо двух цифр заданного трехзначного натурального
         * числа N равна третьей цифре.
         */

        int someDigitNumber;
        int digitOne;
        int digitTwo;
        int digitThree;

        boolean isThreeDigitNumber;
        boolean isDigitEqualsToSum;

        someDigitNumber = 752;

        isThreeDigitNumber = (someDigitNumber / 100 != 0);

        digitOne = someDigitNumber / 100;
        digitTwo = someDigitNumber % 100 / 10;
        digitThree = someDigitNumber % 100 % 10;

        isDigitEqualsToSum = (isThreeDigitNumber
                && ((digitOne + digitTwo == digitThree)
                        || (digitTwo + digitThree == digitOne)
                        || (digitThree + digitOne == digitTwo)));

        System.out.println("37g: " + isDigitEqualsToSum);
    }

    public static void task37h() {
        /*
         * h) Заданное число N является степенью числа а (показатель степени
         * может находиться в диапазоне от 0 до 4.
         */

        double givenNumber;
        double baseOfPower;
        double exponentOfPower;

        boolean isNumberPower;

        givenNumber = 8.0;
        baseOfPower = 2.0;

        exponentOfPower = Math.log(givenNumber) / Math.log(baseOfPower);

        isNumberPower = (exponentOfPower >= 0 && exponentOfPower <= 4);

        System.out.println("37h: " + isNumberPower);
    }

    public static void task37i() {
        /*
         * i) График функции y = ax^2 + bx + c проходит через заданную точку с
         * координатами (m, n).
         */

        double m;
        double n;

        double a;
        double b;
        double c;
        double x;
        double y;

        boolean isIntersect;

        m = 4;
        n = 2;

        a = 1;
        b = -3;
        c = -2;

        x = m;
        y = a * Math.pow(x, 2) + b * x + c;

        isIntersect = (y == n);

        System.out.println("37i: " + isIntersect);
    }
}
