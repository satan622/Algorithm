package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int peopleNum = scan.nextInt();
		ArrayList<Integer> times = new ArrayList<>(); 
		
		int sum=0, result = 0;
		
		for(int i=0; i<peopleNum; i++) {
			times.add(scan.nextInt());
		}
		
		for(int j=0; j<peopleNum; j++) {
			int min = Integer.MAX_VALUE;
			for(int i=0; i<times.size(); i++) {
				min = Math.min(min, times.get(i));
			}
			times.remove(times.indexOf(min));
			sum += min;
			result += sum;
		}
		System.out.println(result);
		
		
		scan.close();
	}
}
