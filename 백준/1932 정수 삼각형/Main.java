import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 삼각형의 크기
		int[][] tri = new int[n][]; // 정수 삼각형을 담을 배열

		for (int i = 0; i < n; i++) { // 정수 삼각형 입력
			tri[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}

		int[][] dp = tri; // 각 선택 시의 합을 담을 dp 배열

		for (int i = 1; i < tri.length; i++) {
			// dp[0][0]에는 tri[0][0] 그대로 저장
			for (int j = 0; j < tri[i].length; j++) {
				if (j == 0) { // 가장 왼쪽에 위치한 수 들의 합
					dp[i][j] += tri[i - 1][j];
				} else if (j == i) { // 가장 오른쪽에 위치한 수 들의 합
					dp[i][j] += tri[i - 1][j - 1];
				} else { // 현재 가리키는 위치가 가장 왼쪽이나 오른쪽이 아닐 경우
					// 현재 가리키는 수를 더할 수 있는 왼쪽 위 혹은 오른쪽 위의 숫자 둘 중 더했을 떄 더 큰 값이 나올 수 있는 수를 더함
					dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[n - 1][i], max); // dp 배열의 가장 아래에 위치한 최종값들 중 max값 출력 
		}
		System.out.println(max);

		sc.close();
	}
}