package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(626331));
	}
}

class Solution {
	public int solution(int num) {
		int answer = 0;
		long n = num;
		while (n != 1) {
			if (n % 2 == 0)
				n /= 2;
			else
				n = n * 3 + 1;
			answer++;
			System.out.println("n: " + n + ", count: " + answer);
			if (answer >= 500) {
				return -1;
			}
		}

		return answer;
	}
}