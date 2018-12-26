package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(11));
	}
}

class Solution {
	public boolean solution(int x) {
		boolean answer = false;
		String s = x + "";
		int[] nums = new int[s.length()];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(s.substring(i, i+1));
			sum += nums[i];
		}
		if (x % sum == 0)
			answer = true;

		return answer;
	}
}