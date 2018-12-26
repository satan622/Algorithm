package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[2];
		int hun = 0, ten = 0, one = 0;
		
		for(int i=0; i<2; i++) {
			n[i] = scan.nextInt();
			for(int j=0; j<3; j++) {
				hun = n[i]/100;
				ten = n[i]%100/10;
				one = n[i]%100%10;
			}
			n[i] = one*100+ten*10+hun;
		}
		if(n[0]>n[1])
			System.out.println(n[0]);
		else
			System.out.println(n[1]);
	}
}