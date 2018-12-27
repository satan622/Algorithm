package main;

import java.util.Scanner;

public class SelectionSort {
	//x배열의 idx1과 idx2에 들어있는 값을 서로 교환
	private static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}

	//선택 정렬
	private static void selectionSort(int[] x, int n) {
		for(int i=0; i < n - 1; i++) { //마지막 요소는 비교 대상이 없으므로 n - 1
			
			int min = i; //아직 정렬되지 않은 부분에서 최소값의 인덱스를 저장

			for(int j=i+1; j < n; j++) { //정렬되지 않은 요소들 중 최소값을 검색
				if(x[j] < x[min]) { //x[j]가 현재 최소값보다 작으면 min에 j를 저장
					min = j; 
				}
				swap(x, i, min); //x[i]와 최소값을 교환
			}
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
		
		selectionSort(x, n); //선택 정렬 수행
		
		//정렬 결과 출력
		System.out.println("\n오름차순으로 정렬 결과");
		for(int i=0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		sc.close();
	}
}
