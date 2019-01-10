import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스

		int[] answer = new int[t]; // 각 테스트 케이스 별 정답을 저장

		for (int k = 0; k < t; k++) {
			int n = sc.nextInt(); // 동전의 종류 수
			int[] coin = new int[n]; // 동전의 종류

			for (int i = 0; i < n; i++) { // 동전 종류 입력
				coin[i] = sc.nextInt();
			}

			int m = sc.nextInt(); // 만들어야 할 돈

			int[] dp = new int[m + 1]; // 각 원마다 완성할 수 있는 경우의 수를 담을 배열
			dp[0] = 1; // j - coin[i]가 0이 되는 경우의 수(만들고자 하는 금액이 동전의 금액과 같을때 경우의 수)를 반드시 1로 만들기 위함
						// 예를 들어 5원짜리 동전으로 5원의 금액을 만들 수 있는 경우의 수

			for (int i = 0; i < n; i++) { // 동전의 종류만큼 반복
				for (int j = coin[i]; j <= m; j++) { // coin
					dp[j] += dp[j - coin[i]]; // dp 배열에 coin[i]를 사용해서 만들 수 있는 경우의 수 추가
				}
			}
			answer[k] = dp[m];
		}

		// 정답 출력
		for (int k = 0; k < answer.length; k++) {
			System.out.println(answer[k]);
		}
		sc.close();
	}
}