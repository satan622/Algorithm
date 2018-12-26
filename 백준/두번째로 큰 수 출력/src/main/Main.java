package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n[] = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = scan.nextInt();
		}

		for (int i = 0; i < n.length - 1; i++) {
			int temp;
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
		System.out.println(n[1]);
	}
}