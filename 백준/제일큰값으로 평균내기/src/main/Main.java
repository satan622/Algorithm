package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float score[] = new float[n];
		float big = 0;
		float result = 0;

		for (int i = 0; i < n; i++) {
			score[i] = scan.nextFloat();
			if (score[i] > big)
				big = score[i];
		}

		for (int i = 0; i < n; i++) {
			score[i] = score[i] / big * 100;
			result += score[i];
		}
		System.out.println(result / n);
	}
}