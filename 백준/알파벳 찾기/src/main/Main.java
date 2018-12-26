package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		for (int j = 97; j <= 122; j++) {
			int result = -1;
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == j) {
					result = i;
					break;
				}
			}
			System.out.print(result + " ");
		}
	}
}