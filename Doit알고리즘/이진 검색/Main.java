package main;

import java.util.Scanner;

public class Main {
	static int binSearch(int[] a, int n, int key) { //a: 검색할 배열, n:배열의 길이, key: 찾고자 하는 데이터
		int pl = 0; //검색 범위의 첫 인덱스
		int pr = n - 1; //검색 범위의 마지막 인덱스
		
		do {
			int pc = (pl + pr) / 2; //배열 중앙의 인덱스
			
			if(a[pc] == key) { //검색 성공
				return pc;
			}else if(a[pc] < key) { //찾고자 하는 값이 중앙값보다 클 경우 검색할 범위를 중앙보다 큰 값들로 좁힘
				pl = pc + 1;
			}else { //찾고자 하는 값이 중앙값보다 작을 경우 검색할 범위를 중앙보다 작은 값들로 좁힘
				pr = pc - 1;
			}
		}while(pl <= pr);
		
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt(); //배열 길이 입력
		int[] x = new int[num]; //배열 선언
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: "); //첫 요소 입력
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: "); //키 값을 입력
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky); //배열 x에서 키 값이 ky인 요소 검색
		
		if(idx == 1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky + "의 위치: " + idx);
		}
		
		sc.close();
	}
}