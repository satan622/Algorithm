package main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		int total = 0;
		
		for(int i=0; i<str.length(); i++) { //입력된 문자열 탐색
			if(str.charAt(i) == '(') { //i번째 문자가 '('이면 push
				stack.push('s'); //들어가는 문자는 중요하지 않음 스택의 사이즈를 늘리기 위함
			}else{ //문자가 ')'이면 pop
				stack.pop();
				if(str.charAt(i-1) == '(') { //이전 문자가 '('였다면 레이저 이므로 잘린 개수 증가
					total += stack.size();
				}else { //이전 문자가 '('가 아니었다면 쇠막대의 오른쪽 끝이므로 잘린 조각 개수에 오른쪽 끝 조각 수 더함
					total ++;
				}
			}
		}
		System.out.println(total);
		
		sc.close();
	}
}