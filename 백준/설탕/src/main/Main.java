package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N; // 설탕 킬로 수
		int a, b; // a 5키로 b 3키로 개수
		int n; // 나머지를 저장할 변수
		int result = 0, small = -1;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		for (a = N / 5; a >= 0; a--) {
			n = N - 5 * a;
			b = n / 3;
			n = n % 3;
			
			if(n == 0) result = a + b;
			else result = small;
			
			if (small == -1 || result < small && n == 0) {
				small = result;
			}
		}

		System.out.println(small);
	}
}