package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] n = sol.solution(12345);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}

class Solution {
	public int[] solution(long n) {
		String str = Long.toString(n);
		int[] answer = new int[str.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[answer.length - 1 - i] = Integer.parseInt(str.substring(i, i + 1));
		}
		return answer;
	}
}