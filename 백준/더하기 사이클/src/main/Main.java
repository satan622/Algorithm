package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = 0, b = 0, c = 0;
		int first = num;
		int count = 0;
		do {
			if (num < 10) {
				a = 0;
				b = num;
			} else if (num >= 10) {
				a = num / 10;
				b = num % 10;
			}

			c = a + b;
			c = c%10;
			num = b * 10 + c;
			count++;
		} while (num != first);
		System.out.println(count);
	}
}