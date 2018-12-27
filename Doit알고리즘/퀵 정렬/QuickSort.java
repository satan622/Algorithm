package main;

import java.util.Scanner;

public class QuickSort {
	// 배열 요소 x[idx1]과 x[idx2]를 교환
	static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}

	// 퀵 정렬
	static void quickSort(int[] x, int left, int right) {
		int pl = left; // 왼쪽 커서
		int pr = right; // 오른쪽 커서
		int pivot = x[(pl + pr) / 2]; // 피벗

		do { // 왼쪽그룹에 있는 피벗보다 큰 수를 오른쪽 그룹으로, 오른쪽 그룹에 있는 피벗보다 작은 수를 왼쪽 그룹으로 보낸다.
			while (x[pl] < pivot) pl++; // 왼쪽 커서에 있는 값이 피벗보다 작으면 커서를 오른쪽으로
			while (x[pr] > pivot) pr--; // 오른쪽 커서에 있는 값이 피벗보다 크면 커서를 왼쪽으로
			if (pl <= pr) swap(x, pl++, pr--); // 왼쪽 커서와 오른쪽 커서의 값을 교환
		} while (pl <= pr);

		if(left < pr) quickSort(x, left, pr); //pr이 배열의 가장 왼쪽에 도달하지 못했으면 분할 된 왼편을 다시 분할
		if(right > pl) quickSort(x, pl, right); //pl이 배열의 가장 오른쪽에 도달하지 못했으면 분할 된 오른편을 다시 분할		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.print("배열 길이: ");
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		quickSort(x, 0, n - 1);

		System.out.println("오름차순으로 정렬");
		for(int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		sc.close();
	}
}
