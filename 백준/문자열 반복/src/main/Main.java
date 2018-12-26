package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "ABC";

		int testCase = scan.nextInt();
		String[] t = new String[testCase];

		for (int k = 0; k < testCase; k++) {
			t[k] = "";
			int r = scan.nextInt();
			s = scan.next();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < r; j++) {
					t[k] += s.charAt(i);
				}
			}
		}

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}