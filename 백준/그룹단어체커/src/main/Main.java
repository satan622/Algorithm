package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean group = true;
		int count = 0;

		int num = scan.nextInt();
		String[] check = new String[num];

		for (int k = 0; k < num; k++) {
			String str = scan.next();
			check[k] = "";
			for (int i = 0, j = 0; i < str.length(); i++) {
				if (i == 0) {
					check[k] = "" + str.charAt(i);
				} else if (check[k].charAt(j) != str.charAt(i)) {
					check[k] += str.charAt(i);
					j++;
				}
			}
		}
		for (int k = 0; k < num; k++) {
			group = true;
			for (int i = 0; i < check[k].length(); i++) {
				for (int j = i + 1; j < check[k].length(); j++) {
					if (check[k].charAt(i) == check[k].charAt(j)) {
						group = false;
						break;
					}
				}
			}
			if (group)
				count++;
		}

		System.out.println(count);

	}
}