package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int a = 0,b = 0;
		
		for(int k=1; count<=n; k++) {
			if(k == 1 || k%2==1) {
				for(int i=k, j=1; j<=k; j++,i--) {
					a = i;
					b = j;
					count++;
					if(count == n) System.out.println(a + "/" + b);
					
				}
			}
			if(k == 0 || k%2==0) {
				for(int j=k, i=1; i<=k; i++,j--) {
					a = i;
					b = j;
					count++;
					if(count == n) System.out.println(a + "/" + b);
				}
			}
		}
	}
}