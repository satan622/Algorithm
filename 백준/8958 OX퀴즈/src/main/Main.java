package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] score = new int[num];
		int stack = 1;

		for (int i = 0; i < num; i++) {
			String OX = scan.next();
			score[i] = 0;
			
			for (int j = 0; j < OX.length(); j++) {
				if (OX.charAt(j) == 'O') {
					score[i] += stack;
					stack += 1;
				} else {
					stack = 1;
				}
			}
			stack = 1;
			
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
}