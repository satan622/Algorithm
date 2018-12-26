package main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(118372));
	}
}

class Solution {
	public long solution(long n) {
		long answer = 0;
		
		String str = Long.toString(n);
		long[] l = new long[str.length()];
		for(int i=0; i<l.length; i++) {
			l[i] = Long.parseLong(str.substring(i,i+1));
		}
		Arrays.sort(l);
		str = "";
		for(int i=l.length-1; i>=0; i--) {
			str += l[i];
		}
		answer = Long.parseLong(str);
		return answer;
	}
}