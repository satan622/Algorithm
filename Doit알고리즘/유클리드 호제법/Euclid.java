package main;

import java.util.Scanner;

public class Euclid {
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	}
	static int lcm(int x, int y, int gcd) {
		return x * y / gcd;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("큰 수 입력: ");
		int x = sc.nextInt();
		System.out.print("작은 수 입력: ");
		int y = sc.nextInt();
		
		int gcd = gcd(x, y);
		System.out.println("최소 공배수: " + gcd);
		System.out.println("최대 공약수: " + lcm(x, y, gcd));
		
		sc.close();
	}
}
