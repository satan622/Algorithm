package main;

import java.util.Scanner;

public class InsertionSort {
	//삽입 정렬
	private static void insertionSort(int[] x, int n) {
		for(int i=1; i<n; i++) { //0번 인덱스는 정렬된 그룹으로 놓고, 1번 인덱스부터 시작
			int j;
			int temp = x[i]; //temp에 x[i]값 저장
			for(j = i; j > 0 && x[j-1] > temp; j--) { //0번 인덱스에 도달하거나 x[j - 1]이 temp보다 크지 않다면 반복 종료
				x[j] = x[j - 1];
			}
			x[j] = temp; //x[j]에 temp값 대입
			//i번 인덱스까지 정렬 완료
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택정렬");
		System.out.print("요솟수: ");	
		int n = sc.nextInt(); //배열의 길이 입력
		int[] x = new int[n]; //배열 생성
		
		//배열의 각 요소 값 입력
		for(int i=0; i < n; i++) { 
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, n); //삽입 정렬 수행
		
		//정렬 결과 출력
		System.out.println("\n오름차순으로 정렬 결과");
		for(int i=0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		sc.close();
	}
}
