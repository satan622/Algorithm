package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int zero = 0;
			int one = 0;
			int nextOne = 0;
			
			if (n == 0) {
				zero = 1;
			} else if (n == 1) {
				one = 1;
			} else {
				zero = 1;
				one = 1;
				for (int j = 0; j < n - 2; j++) {
					nextOne = zero+one;
					zero = one;
					one = nextOne;
				}
			}
			System.out.println(zero + " " + one);
		}
		sc.close();
	}
	//
	// private int fibonacci(int n) {
	// if (n == 0) {
	// System.out.println("0");
	// return 0;
	// } else if (n == 1) {
	// System.out.println("1");
	// return 1;
	// } else {
	// return fibonacci(n-1) + fibonacci(n-2);
	// }
	// }
}
