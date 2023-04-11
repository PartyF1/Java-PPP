/*
 *	Дано натуральные числа n, m. Проверить, не является ли палиндромом запись цифр
 *	этого числа в m-ичной системе счисления?
*/

package main;

import java.util.Scanner;

public class Lab2 {
	
	public static String convert(int n, int m) {
		return Integer.toString(n, m);
	};
	
	public static String itsPalindrom (String str) {
		int l = str.length();
		int i = 0;
		while (i < l/2) {
			if (str.charAt(i) != str.charAt(l-1-i)) 
				return "Не палиндром";
			i++;
		}
		return "Палиндром";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Какое число будем проверять?");
        int n = in.nextInt();
        System.out.println("В какую систему?");
        int m = in.nextInt();
        String converted = convert(n, m);
        System.out.println("Конвертированное число: " + converted + ", " + itsPalindrom(converted));
        
    }
}
