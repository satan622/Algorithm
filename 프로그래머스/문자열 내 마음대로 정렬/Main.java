package main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] str = { "abce", "abcd", "cdx" };
		String[] result = sol.solution(str, 1);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class Solution {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strings[i].substring(n,n+1) + strings[i];
		}
		Arrays.sort(answer);

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answer[i].substring(1, answer[i].length());
		}
		return answer;
	}
}