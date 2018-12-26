package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("-1 -2 -3 -4"));
	}
}

class Solution {
	public String solution(String s) {
		String[] arr = s.split(" ");
		int[] nums = new int[arr.length];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
			if (nums[i] < min)
				min = nums[i];
			if (nums[i] > max)
				max = nums[i];
		}
		String answer = min + " " + max;
		return answer;
	}
}