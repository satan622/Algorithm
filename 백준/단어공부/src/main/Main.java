package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] n = new int[26];
		int most = 0;
		int index = 0;
		boolean multi = false;

		for (int j = 0; j < 26; j++) {
			n[j] = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == j + 65 || str.charAt(i) == j + 97) {
					n[j] += 1;
				}
			}
			if (most < n[j]) {
				most = n[j];
				index = j + 65;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				if (i != j && n[j] == most && n[i] == most)
					multi = true;
			}
		}

		if (multi) {
			System.out.println("?");
		} else {
			System.out.println((char) index);
		}
	}
}