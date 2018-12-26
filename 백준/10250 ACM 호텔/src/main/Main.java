package main;

import java.util.Scanner;

import javax.xml.soap.Node;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] rNum = new int[num];
		
		for (int k = 0; k < num; k++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			int count = 0;
			for (int j = 0; j < w && count < n; j++) {
				for (int i = 0; i < h && count < n; i++) {
					rNum[k] = (i + 1) * 100 + j + 1;
					count++;
				}
			}
		}
		
		for(int k=0; k < num; k++) {
			System.out.println(rNum[k]);
		}
	}
}