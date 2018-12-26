package main;

import java.util.Scanner;

public class IntStack {
	private int max; //스택의 용량
	private int ptr; //스택 포인터
	private int[] stk; //스택 본체
	
	//실행 시 예외: 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
		}
	}
	
	//실행 시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
		}
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		
		try {
			stk = new int[max]; //스택 본체 배열 생성
		}catch (OutOfMemoryError e) { //생성 불가
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max) { //스택이 가득차면 예외 발생
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	//스택의 가장 위에 있는 데이터를 내보냄
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) { //스택이 비어있으면 예외발생
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	
	//스택의 가장 위에 있는 데이터를 조회
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) { //스택이 비어있으면 예외발생
			throw new EmptyIntStackException(); 
		}
		return stk[ptr - 1];
	}
	
	//스택에서 x값을 찾아 인덱스 반환
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는지 검사
	public boolean isEmpty() {
		return ptr >= max;
	}
	
	//스택의 모든 데이터를 맨 아래 있는 값부터 출려
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64); //64개의 데이터를 담을 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " /" + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ");
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1: //푸시
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2: //팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 3: //피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4: //덤프
				s.dump();
				break;
			}
		}
		
		sc.close();
	}
}
