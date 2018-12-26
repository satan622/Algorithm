package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str = "qwer";
		System.out.println(sol.solution(str));
		
	}
}

class Solution {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}

		return answer;
	}
}