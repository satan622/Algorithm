import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 자리수 입력
		long[][] dp = new long[n][10];
		long sum = -1; // 총 경우의 수. 1의 자리 계산 시 0이 올 수 없으므로 dp[0]을 빼주기 위해 -1

		for (int i = 0; i < 10; i++) { // 1의 자리인 숫자에 올 수 있는 가지 수는 모두 1
			dp[0][i] = 1; // dp[0][0]은 다음 자리 수에 올 수 있는 경우의 수를 위해 저장
			sum = (sum + dp[0][i]) % 1000000000; // n = 1일 때(숫자가 1의 자리일 때) 경우의 수
		}

		// i + 1 자리의 숫자 맨 앞에 j가 올 때 계단수가 나오는 경우의 수를 dp 배열에 저장
		for (int i = 1; i < n; i++) {
			sum = 0;
			for (int j = 0; j < 10; j++) {
				if (j == 0) { // 0이 올 경우 sum에 더하진 않고 다음 자리 수의 계산을 위해 저장
					dp[i][j] = dp[i - 1][j + 1] % 1000000000;
					continue; // 맨 앞 자리에 0은 올 수 없기 때문에 sum에 더하지 않음
				} else if (j == 9) { // 9가 올 경우 다음 숫자는 8밖에 올 수 없으므로 이전 자리수의 8의 경우의 수를 저장
					dp[i][j] = dp[i - 1][j - 1] % 1000000000;
				} else { // 0이나 9가 아니면 다음 자리에 j - 1과 j + 1이 올 수 있음
					dp[i][j] = dp[i - 1][j - 1] % 1000000000 + dp[i - 1][j + 1] % 1000000000;
				}
				sum = (sum + dp[i][j]) % 1000000000; // 경우의 수를 합
			}
		}

		System.out.println(sum);

		sc.close();
	}
}