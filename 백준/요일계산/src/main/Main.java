package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int limit;
		int month, day;
		int pointer = 1;
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for( month = 1;month<=x; month++) {
			if(month == 4 || month == 6 || month == 9 || month == 11) limit = 30;
			else if(month == 2) limit = 28;
			else limit = 31;
			
			for(day = 1; day <= limit; day++, pointer++) {
				if(pointer > 7) pointer = 1;
				if(x == month && y == day) break;
			}
			if(x == month && y == day) break;
		}
		
		
		switch(pointer) {
		case 1:
			System.out.println("MON");break;
		case 2:
			System.out.println("TUE");break;
		case 3:
			System.out.println("WED");break;
		case 4:
			System.out.println("THU");break;
		case 5:
			System.out.println("FRI");break;
		case 6:
			System.out.println("SAT");break;
		case 7:
			System.out.println("SUN");break;
		}
	}
}