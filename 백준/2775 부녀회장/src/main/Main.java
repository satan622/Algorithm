package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int[] result = new int[tc];
		for (int x = 0; x < tc; x++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			int[][] A = new int[k + 1][n];
			for (int j = 0; j <= k; j++) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					if (j == 0) {
						A[j][i] = i + 1;
					} else {
						sum += A[j - 1][i];
						A[j][i] = sum;
					}
				}
			}
			result[x] = A[k][n-1];
		}
		
		for(int x=0; x<tc; x++) {
			System.out.println(result[x]);
		}
	}
}