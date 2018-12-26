package main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Integer> stack = new Stack<>();
		int total = 0;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == '(' && str.charAt(i+1) ==')') {
				for(int j=0; j<stack.size(); j++) {
					stack.set(j, stack.get(j)+1);
				}
			}else if(str.charAt(i) == '(') {
				stack.push(1);
			}else if(str.charAt(i+1) == ')' && !stack.isEmpty()) {
				total += stack.pop();
			}
		}
		System.out.println(total);
		
		sc.close();
	}
}