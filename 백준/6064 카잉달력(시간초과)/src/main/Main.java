package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 테스트 케이스

		int year[] = new int[num]; // k번째 해
		for (int i = 0; i < num; i++) {
			// 마지막 해
			int M = scan.nextInt();
			int N = scan.nextInt();
			// 찾고자 하는 해
			int x = scan.nextInt();
			int y = scan.nextInt();
			// 현재 해
			int x1 = 0, y1 = 0; // x', y'
			year[i] = 0;

			while (x1 != x || y1 != y) {
				if (x1 < M) {
					x1 = x1 + 1;
				} else {
					x1 = 1;
				}
				if (y1 < N) {
					y1 = y1 + 1;
				} else {
					y1 = 1;
				}
				year[i]++;
				if (x1 == M && y1 == N && (x1 != x || y1 != y)) {
					year[i] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.println(year[i]);
		}
		scan.close();
	}
}
