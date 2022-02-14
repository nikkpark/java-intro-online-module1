package ru.hitchin.module1.branching;

/*
 * Задача 34.
 * Составить программу,
 * реализующую эпизод применения компьютера в книжном магазине.
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
 * если сдачи не требуется, печатает на экране "Спасибо";
 * если денег внесено больше, чем необходимо, то печатает "Возьмите сдачу"
 * и указывает сумму сдачи;
 * если денег недостаточно, то печатает сообщение об этом и указывает размер
 * недостающей суммы.
 */
public class Task34 {

    public static void main(String[] args) {
	task34(34.9, 34.9);
	task34(34.9, 50.0);
	task34(34.9, 25.0);
    }
    
    public static void task34(double purchase, double cash) {
	System.out.println("Purchase: $" + purchase);
	System.out.println("Cash: $" + cash);

	if (purchase == cash) {
	    System.out.println("Thank you.");
	} else if (purchase < cash) {
	    System.out.print("Thank you. ");
	    System.out.println("Take your change: "
		    		+ String.format("$%.2f", (cash - purchase)));
	} else if (purchase > cash) {
	    System.out.println("Not enough money. Add "
		    		+ String.format("$%.2f", (purchase - cash)));
	}
	
	System.out.println();
    }
}
