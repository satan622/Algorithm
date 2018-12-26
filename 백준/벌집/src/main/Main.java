package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long max = 1;
		int count=0;
		
		for(int i=0; max < n; i++) {
			max += (6*i);
			count++;
		}
        if(n==1) count = 1;
		System.out.println(count);
	}
}