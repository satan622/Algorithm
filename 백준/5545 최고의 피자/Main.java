import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 토핑의 종류
		int a = sc.nextInt(); // 도우의 가격
		int b = sc.nextInt(); // 토핑의 가격
		int c = sc.nextInt(); // 도우의 열량
		int[] d = new int[n]; // 토핑의 열량

		// 토핑의 열량 입력
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d); // 토핑 열량 오름차순으로 정렬

		double best = (double) c / a; // 1원당 열량 최대값, 초기값은 토핑 0개일 경우
		
		for (int i = 0; i < n; i++) { // 토핑 1개 ~ n개 고르는 경우의 수
			int max = 0; // 토핑 i+1개 고를 시 최고열량
			
			for (int j = d.length - 1; j >= d.length - 1 - i; j--) { // 토핑의 가장 큰 것부터 i+1개 만큼 선택
				max += d[j];
			}
			double cal = (double) (c + max) / (a + b * (i + 1)); // 1원당 열량
			if (cal > best) best = cal;
		}

		System.out.println((int) best);
		sc.close();
	}
}
