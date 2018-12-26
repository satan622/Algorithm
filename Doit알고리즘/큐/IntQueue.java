package main;

import java.util.Scanner;

public class IntQueue {
	private int max; //큐 용량
	private int num; //현재 데이터 수
	private int[] que; //큐 본체
	
	//실행 시 예외: 큐 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
		}
	}
	
	//실행 시 예외: 큐 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {
		}
	}
	
	//생성자
	public IntQueue(int capacity) {
		num = 0;
		max = capacity;

		try {
			que = new int[max]; //큐 본체 배열 생성
		}catch (OutOfMemoryError e) { //생성 불가
			max = 0;
		}
	}
	
	
	//큐에 x를 인큐
	public int enqueue(int x) throws OverflowIntQueueException{
		if(num >= max) { //큐가 가득차면 예외 발생
			throw new OverflowIntQueueException();
		}
		return que[num++] = x;
	}
	
	//큐의 0번에 들어있는 값을 꺼냄
	public int dequeue() throws EmptyIntQueueException {
		if(num <= 0) { //큐가 비었으면 예외 발생
			throw new EmptyIntQueueException();
		}
		int deq = que[0];
		
		for(int i=1; i<=num; i++) {
			que[i-1] = que[i];
		}
		num--;
		return deq;
	}
	
	//큐이 용량을 반환
	public int capacity() {
		return max;
	}
	
	//큐에 쌓여 있는 데이터 수 반환
	public int size() {
		return num;
	}
	
	
}

class IntQueueTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue(64); //최대 64개를 인큐할 수 있는 큐
		
		while(true) {
			System.out.println("현재 데이터 수: " + q.size() + "/" + q.capacity());
			System.out.print("(1)인큐 (2)디큐 (0)종료: ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1: //인큐
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					q.enqueue(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2: //디큐
				try {
					x = q.dequeue();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}
				
			}
			
		}
		
		sc.close();
	}
}