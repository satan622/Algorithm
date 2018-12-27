package main;

//각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
public class QueenB {
	static int[] pos = new int[8]; //각 열의 퀸의 위치
	
	//각 열의 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	//i열에 퀸을 놓는다.
	static void set(int i) {
		for(int j=0; j<8; j++) {
			pos[i] = j;
			if(i == 7) {
				print();
			}else {
				set(i + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
