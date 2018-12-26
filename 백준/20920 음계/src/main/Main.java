package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input.replaceAll(" ", "");
		
		if(input.equals("12345678")) {
			System.out.println("ascending");
		}else if(input.equals("87654321")){
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}