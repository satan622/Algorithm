package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(4));
	}
}

class Solution {
	public String solution(int n) {
		String answer = "";
		while(n>0) {
			int a = n%3;
			n = n/3;
			int add = a;
			if(a == 0) {
				add = 4;
				n--;
			}
			answer = add + answer;
		}
		return answer;
	}
}