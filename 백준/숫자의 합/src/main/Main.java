package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String s;
		int result=0;
		
		n = scan.nextInt();
		s = scan.next();
		
		
		for(int i=0; i<n; i++) {
			result += s.charAt(i) - '0'; // - '0'을 붙이면 문자열을 정수 배열로 변환
		}
		System.out.println(result);
	}
}