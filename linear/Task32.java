package ru.hitchin.module1.linear;

/*
 * Задача 32.
 * Текущее показание электронных часов:
 * m ч(0 <= m <= 23) n мин(0 <= n <= 59) k c(0 <= k <= 59).
 * Какое время будут показывать часы через p ч q мин r с?
 */
public class Task32 {

    public static void main(String[] args) {
	task32();
    }
    
    public static void task32() {	
	int m;
	int n;
	int k;
	
	int p;
	int q;
	int r;
	
	int calculatedTimeInSeconds;
	String formattedTime;
	
	m = 14;
	n = 59;
	k = 10;
	
	p = 27;
	q = 12;
	r = 45;
	
	calculatedTimeInSeconds = (m + p) * 3600 + (n + q) * 60 + k + r;
	
	m = calculatedTimeInSeconds / 3600;
	n = (calculatedTimeInSeconds % 3600) / 60;
	k = (calculatedTimeInSeconds % 3600) % 60;
	
	formattedTime = String.format("%02dч %02dмин %02dс", m, n, k);	

	System.out.println(formattedTime);
    }
}
