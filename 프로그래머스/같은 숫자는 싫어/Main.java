package main;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {1,1,3,3,0,1,1};
		sol.solution(arr);
	}
}

class Solution {
	public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
        	if(stack.isEmpty()) stack.push(arr[i]);
        	else if(stack.peek() != arr[i]) stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = stack.get(i);
        }
        return answer;
	}
}