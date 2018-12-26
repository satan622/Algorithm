package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> dwarf = new ArrayList<>(); 
		int sum = 0;
		for(int i=0; i<9; i++) {
			dwarf.add(sc.nextInt());
			sum += dwarf.get(i);
		}
		
		for(int i=0; i<dwarf.size(); i++) {
			for(int j=i+1; j<dwarf.size(); j++) {
				if(dwarf.get(i) + dwarf.get(j) == sum - 100) {
					dwarf.remove(j);
					dwarf.remove(i);
					sum = 100;
					break;
				}
			}
			if(sum == 100) break;
		}
		
		Collections.sort(dwarf);
		for(int k=0; k<dwarf.size(); k++) {
			System.out.println(dwarf.get(k));
		}
		sc.close();
	}
}

