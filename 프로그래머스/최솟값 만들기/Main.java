package main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr1 = { 1, 4, 2 };
		int[] arr2 = { 5, 4, 4 };
		System.out.println(sol.solution(arr1, arr2));
	}
}

class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<A.length; i++) {
			answer += (A[i] * B[B.length-1-i]);
		}
		
		return answer;
	}
}