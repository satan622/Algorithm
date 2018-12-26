package main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] result = new int[t];
		
		for (int j = 0; j < t; j++) {
			result[j] = 0;
			int n = sc.nextInt(), k = sc.nextInt();
			int[] arr = new int[n];
			for(int x=0; x<n; x++) {
				 arr[x] = sc.nextInt();
			}

			Stack<Integer> stack = new Stack<>();
			stack.push(0);
			for (int i = 0; i < arr.length; i++) {
				if (stack.peek() > arr[i]) {
					int temp = stack.pop();
					if (stack.peek() > arr[i])
						stack.push(temp);
					else
						stack.push(arr[i]);
				}else if (stack.peek() < arr[i]) {
					stack.push(arr[i]);
				}
				if(stack.size()-1 == k) {
					result[j] = 1;
					break;
				}
			}
		}
		
		for(int j=0; j<t; j++) {
			System.out.println("Case #" + (j+1));
			System.out.println(result[j]);
		}
		
		sc.close();
	}
}