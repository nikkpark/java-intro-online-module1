package ru.hitchin.module1.cycle;

/*
 * Задача 30.
 * Написать программу, переводящую римские цифры в арабские.
 */
public class Task30 {

    public static void main(String[] args) {
        task30(24);
        task30(5000);
        task30(0);
        task30(3999);
    }
    
    public static void task30(int arabicNumber) {
        String romanNumber;
        
        romanNumber = convert(arabicNumber);
        
        System.out.println(arabicNumber + ": " + romanNumber);
    }

    public static String romanDigit(int n,
                                    String one, String five, String ten) {        
        switch (n) {
        case 1: return one;
        case 2: return one + one;
        case 3: return one + one + one;
        case 4: return one + five;
        case 5: return five;
        case 6: return five + one;
        case 7: return five + one + one;
        case 8: return five + one + one + one;
        case 9: return one + ten;
        default: return "";
        }
    }

    public static String convert(int number) {
        if (number <= 0 || number > 3999) {
            return "The number cannot be converted.";
        }

        String romanOnes = romanDigit(number % 10, "I", "V", "X");
        number /= 10;

        String romanTens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;

        String romanHundreds = romanDigit(number % 10, "C", "D", "M");
        number /= 10;

        String romanThousands = romanDigit(number % 10, "M", "", "");
        number /= 10;

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        
        return result;
    }
}