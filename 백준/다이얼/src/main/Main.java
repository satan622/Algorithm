package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] alph = new int[26];
		String input = scan.nextLine();
		int time = 0;
		
		for(int i = 0, j=3; i<26; i+=3, j++) {
			if(i == 15 || i == 22) {
				alph[i] = j;
				alph[i+1] = j;
				alph[i+2] = j;
				alph[i+3] = j;
				i++;
			}else {
				alph[i] = j;
				alph[i+1] = j;
				alph[i+2] = j;
			}
		}
		
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<26; j++) {
				if(input.charAt(i) == j+65) time += alph[j];
			}
		}
		System.out.println(time);
	}
}