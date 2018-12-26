package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().trim();
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ' && input.charAt(i + 1) != ' ') {
				count++;
			}

		}
		boolean empty = true;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ' ' && input.charAt(i+1) == ' ') {
				empty = true;
			}else {
				empty = false;
			}
			
		}
		
		if(empty) {
			System.out.println(0);
		}else {
			System.out.println(count+1);
		}
		
		scan.close();
	}
}