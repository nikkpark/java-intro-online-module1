package ru.hitchin.module1.cycle;

/*
 * Задача 26.
 * Вывести на экран таблицу соответствий между символами
 * и их численными обозначениями в памяти компьютера (Таблицу ASCII).
 */
public class Task26 {

    public static void main(String[] args) {
        task26();
    }
    
    public static void task26() {
        String[] nonPrintableSymbols = {
            "NUL", "SOH", "STX", "ETX", "EOT", "ENQ",
            "ACK", "BEL", "BS",  "TAB", "LF",  "VT",
            "FF",  "CR",  "SO",  "SI",  "DLE", "DC1",
            "DC2", "DC3", "DC4", "NAK", "SYN", "ETB",
            "CAN", "EM",  "SUB", "ESC", "FS",  "GS",
            "RS",  "US",  "DEL"
        };
        
        String horizontalLine = "-------------";
        
        System.out.println(" ASCII Table\n");
        System.out.println(horizontalLine);
        System.out.println(String.format("| %1$s | %2$s|", "Dec", "Char"));
        System.out.println(horizontalLine);
        
        for (int i = 0; i < 32; i++) {
            System.out.println(String.format("|%1$3d  | %2$-3s |",
                                             i, nonPrintableSymbols[i]));
            System.out.println(horizontalLine);
        }
        
        for (int i = 32; i < 127; i++) {
            System.out.println(String.format("|%1$3d  |  %2$s  |",
                                             i, (char) i ));
            System.out.println(horizontalLine);
        }
        
        System.out.println(String.format("|%1$d  | %2$s |",
                                         127, nonPrintableSymbols[32]));
        System.out.println(horizontalLine);
    }
}
