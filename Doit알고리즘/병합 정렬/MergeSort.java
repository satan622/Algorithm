package main;

import java.util.Scanner;

public class MergeSort {
	static int[] buff; // 작업용 배열

	// x[left] ~ x[right]를 재귀적으로 병합 정렬
	static void __mergeSort(int[] x, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;

			int i; // 왼쪽 그룹을 버퍼에 저장하기 위한 인덱스로 사용되고 난 후, 오른쪽 그룹 커서로 사용
			int j = 0; // 왼쪽 그룹 커서
			int p = 0; // 버퍼의 인덱스, 왼쪽그룹의 끝을 표시
			int k = left; // 병합된 정렬을 저장하기 위한 인덱스

			__mergeSort(x, left, center); // 배열의 왼쪽 부분을 병합정렬
			__mergeSort(x, center + 1, right); // 배열의 오른쪽 부분을 병합 정렬

			// 버퍼에 왼쪽 그룹을 저장
			for (i = left; i <= center; i++) {
				buff[p++] = x[i];
			}

			// 왼쪽과 오른쪽 그룹을 비교하여 배열에 정렬
			while (i <= right && j < p) { // 오른쪽 커서 혹은 왼쪽 커서가 범위를 벗어나면 반복 종료
				x[k++] = (buff[j] <= x[i]) ? buff[j++] : x[i++];
			}

			// 왼쪽 그룹의 나머지 요소들을 뒤에 붙여 정렬
			while (j < p) {
				x[k++] = buff[j++];
			}
		}
	}

	// 병합 정렬
	static void mergeSort(int[] x, int n) {
		buff = new int[n]; // 작업용 배열을 생성

		__mergeSort(x, 0, n - 1); // 배열 전체를 병합 정렬

		buff = null; // 작업용 배열을 해제
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("병합 정렬");
		System.out.print("배열 길이: ");
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		mergeSort(x, n);

		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

		sc.close();
	}
}
