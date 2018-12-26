package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int n;
		float score[];
		
		
		float percentage[] = new float[c];
		
		for(int i=0; i<c; i++) {
			float average=0;
			n = scan.nextInt();
			score = new float[n];
			
			
			for(int j=0; j<n; j++) {
				score[j] = scan.nextInt();
				average += score[j];
			}
			average /= n;
			
			for(int j=0, count=0; j<n; j++) {
				if(score[j] > average) count += 1;
				percentage[i] = (float)count/n*100;
			}
			
		}
		for(int i=0; i<c; i++) {
			System.out.format("%.3f", percentage[i]);
			System.out.println("%");
		}
	}
}