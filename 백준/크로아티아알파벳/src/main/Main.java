package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] cro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		
		
		//indexOf(string, int)
		for(int j=0; j<str.length(); j++) {
			for(int i=0; i<cro.length; i++) {
				if(j == str.indexOf(cro[i],j)) {
					count--;
				}
			}
		}
		
		System.out.println(count);
	}
}