package main;

import java.util.Scanner;

public class BubbleSort {
	//x배열의 idx1과 idx2에 들어있는 값을 서로 교환
	private static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}
	
	//버블정렬
	private static void bubbleSort(int[] x, int n) {
		int k = 0; //x[k]보다 앞의 값들은 정렬 됨
		
		while(k < n - 1) {
			int last = n - 1; //마지막으로 요소를 교환한 위치
			for(int j=n-1; j > k; j--) { //정렬된 그룹의 뒤 까지만 비교
				if(x[j-1] > x[j]) {
					swap(x, j - 1, j);
					last = j; //마지막 교환의 오른쪽 인덱스 저장
				}
			}
			k = last;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬");
		System.out.print("요솟수: ");
		int n = sc.nextInt(); //배열의 길이 입력
		int[] x = new int[n]; //배열 생성
		
		//배열의 각 요소 값 입력
		for(int i=0; i < n; i++) { 
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, n); //버블정렬 수행
		
		//정렬 결과 출력
		System.out.println("\n오름차순으로 정렬 결과");
		for(int i=0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		sc.close();
	}
	
}
