package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int room = scan.nextInt();
		int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String str = Integer.toString(room);
		int set = 0;
		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < str.length(); i++) {
				if (Integer.parseInt(str.substring(i, i + 1)) == j) {
					num[j]++;
				}
			}
		}
		int sixNine = num[6] + num[9];
		if(sixNine%2==1) {
			num[6] = sixNine/2;
			num[9] = sixNine/2+1;
		}else {
			num[6] = sixNine/2;
			num[9] = sixNine/2;
		}
		while(true){
			int zeroCheck = 0;
			for (int j = 0; j < num.length; j++) {
				if(num[j]>0) {
					num[j]--;
				}else{
					zeroCheck++;
				}
			}
			if(zeroCheck == 10) break;	
			set++;
		}
		System.out.println(set);
	}
}
