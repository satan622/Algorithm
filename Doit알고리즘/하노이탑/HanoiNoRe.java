package main;

import java.util.Scanner;
import java.util.Stack;

public class HanoiNoRe {
	
	//no: 옮겨야 할 원반 개수, x: 시작 기둥의 번호, y:목표 기둥의 번호
	static void move(int no, int x, int y) { //no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
//		if(no > 1) {
//			move(no-1, x, 6-x-y);
//		}
//		
//		System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
//		
//		if(no > 1) {
//			move(no-1, 6-x-y, y);
//		}
		
		Stack<Integer> xStack = new Stack<>(); //x 스택
		Stack<Integer> yStack = new Stack<>(); //y 스택
		Stack<Integer> swStack = new Stack<>(); //sw 스택
		int sw = 0;
		
		while(true) {
			if(sw == 0 && no > 1) {
				xStack.push(x);
				yStack.push(y);
				swStack.push(sw);
				
				no = no - 1;
				y = 6 - x - y;
				
				continue;
			}
			System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
			
			if(sw == 1 && no > 1) {
				xStack.push(x);
				yStack.push(y);
				swStack.push(sw);
				
				no = no - 1;
				x = 6 - x - y;
				
				if(++sw == 2) {
					sw = 0;
				}
				
				continue;
			}
			
			
			do {
				if(xStack.isEmpty()) {
					return;
				}
				
				x = xStack.pop();
				y = yStack.pop();
				sw = swStack.pop() + 1;
				no++;
			}while(sw == 2);

		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이 탑");
		System.out.print("원반 개수: ");
		int n = sc.nextInt();
		
		move(n, 1, 3); //1번 기둥의 n개 원반을 3번 기둥으로 옮김
		
		sc.close();
	}
	
}
