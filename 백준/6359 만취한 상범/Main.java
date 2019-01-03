import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스
		int[] answer = new int[t]; // 각 테스트 케이스 별 도망자 수

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // 각 테스트 케이스 별 방 개수
			boolean[] isOpened = new boolean[n];

			int count = 0;

			for (int j = 1; j <= n; j++) { // 라운드 반복문
				count = 0;
				for (int k = 1; k <= n; k++) { // 방 반복문
					if (k % j == 0)
						isOpened[k - 1] = !isOpened[k - 1];
					if (isOpened[k - 1])
						count++;
				}
			}
			answer[i] = count;
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		sc.close();
	}
}