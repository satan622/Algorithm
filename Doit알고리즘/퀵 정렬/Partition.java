package main;

import java.util.Scanner;

public class Partition {
	// 배열 요소 x[idx1]과 x[idx2]를 교환
	static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}

	// 배열을 피벗을 기준으로 두 그룹으로 나눔
	static void partition(int[] x, int n) {
		int left = 0; // 왼쪽 커서
		int right = n - 1; // 오른쪽 커서
		int pivot = x[n / 2]; // 피벗

		do { // 왼쪽그룹에 있는 피벗보다 큰 수를 오른쪽 그룹으로, 오른쪽 그룹에 있는 피벗보다 작은 수를 왼쪽 그룹으로 보낸다.
			while (x[left] < pivot)
				left++; // 왼쪽 커서에 있는 값이 피벗보다 작으면 커서를 오른쪽으로
			while (x[right] > pivot)
				right--; // 오른쪽 커서에 있는 값이 피벗보다 크면 커서를 왼쪽으로
			if (left <= right)
				swap(x, left++, right--); // 왼쪽 커서와 오른쪽 커서의 값을 교환
		} while (left <= right);

		System.out.println("피벗의 값: " + pivot);

		System.out.println("피벗 이하의 그룹");
		for (int i = 0; i <= left - 1; i++) {
			System.out.print(x[i] + " "); // x[0] ~ x[left - 1]
		}
		System.out.println();

		if (left > right + 1) { // 피벗값에서 만나 교차하여 right - pivot - left인 상태
			System.out.println("피벗과 일치하는 그룹");
			for (int i = right + 1; i <= left - 1; i++) {
				System.out.print(x[i] + " "); // x[right + 1] ~ x[left - 1]
			}
			System.out.println();
		}

		System.out.println("피벗 이상의 그룹");
		for (int i = right + 1; i < n; i++) {
			System.out.print(x[i] + " "); // x[right + 1] ~ x[n - 1]
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열을 나눕니다.");
		System.out.print("배열 길이: ");
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		partition(x, n);

		sc.close();
	}
}
