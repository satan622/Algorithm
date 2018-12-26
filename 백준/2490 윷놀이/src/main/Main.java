package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] yut = new int[4];
		int[] sum = new int[3];

		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<yut.length; j++) {
				yut[j] = scan.nextInt();
				sum[i]+= yut[j];
			}
		}
		for(int i=0; i<sum.length; i++) {
			switch(sum[i]) {
			case 3:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 1:
				System.out.println("C");
				break;
			case 0:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
				break;
			default:
					break;
			}
		}
		scan.close();
	}
}
