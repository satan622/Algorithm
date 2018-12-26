package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int x=0; x<arr.length; x++) {
			arr[x] = scan.nextInt();
		}
		
		for(int i=arr.length-1; i > 0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		
	}
}
