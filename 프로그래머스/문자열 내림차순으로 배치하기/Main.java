package main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("Zbcdefg"));
	}
}

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] ss = s.split("");
		Arrays.sort(ss);
		for (int i = 0; i < s.length(); i++) {
			answer = ss[i] + answer;
		}
		return answer;
	}
}