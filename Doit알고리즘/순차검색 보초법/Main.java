package main;

import java.util.Scanner;

public class Main {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; //보초를 추가
		
		while(true) {
			if(a[i] == key) { //현재 검색중인 값이 키값과 같다면 종료
				break;
			}
			i++;
		}
		
		return i == n ? -1 : i; //현재 인덱스 번호가 배열의 마지막 인덱스면 찾고자 하는 값 없음. -1 반환, 아니라면 검색 성공. 인덱스 번호 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//요소 개수와 각 요소의 값 입력
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		//키 값 입력
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky); //배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else{
			System.out.println(ky + "의 위치: " + idx);
		}
		
		sc.close();
	}
}