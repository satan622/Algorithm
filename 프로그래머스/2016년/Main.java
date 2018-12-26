package main;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(5, 24));

	}
}

class Solution {
	public String solution(int a, int b) {
		String answer = "";
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int i=0;
		for(int m = 1; m<=a; m++) {
			int len = 31;
			if( m == 4 || m == 6 || m==9 || m==11 ) len = 30;
			else if(m == 2) len = 29;
			
			for(int d=1; d<=len; d++) {
				answer = day[i%7];
				i++;
				if(a == m && b == d) break;
			}
		}
		return answer;
	}
}