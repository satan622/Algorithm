package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		String st = "";
		st += result;
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < st.length(); i++) {
			
			for (int j = 0; j < 10; j++) {
				if (st.charAt(i) == j+'0')
					num[j]++;
			}
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(num[j]);
		}
	}
}