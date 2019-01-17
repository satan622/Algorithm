import java.util.Scanner;

public class Main {
	static int[][] adMatrix; // 인접 행렬
	static boolean[] visit;
	static int[][] answer;

	// 현재 정점을 방문표시 하지 않고 dfs로 탐색
	static void dfs(int n, int v) {
		for (int i = 0; i < n; i++) {
			if (adMatrix[v][i] == 1 && !visit[i]) { // v정점에서 i정점으로 이동할 수 있으면 방문 표시하고 다음 정점을 탐색
				visit[i] = true;
				dfs(n, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수

		adMatrix = new int[n][n]; // 인접 행렬
		answer = new int[n][n]; // 정답 출력 배열

		for (int i = 0; i < n; i++) { // 인접 행렬을 입력
			for (int j = 0; j < n; j++) {
				adMatrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			visit = new boolean[n]; // 현재 정점에서 방문할 수 있는 정점들을 표시하는 배열
			dfs(n, i); // dfs 호출
			for (int j = 0; j < n; j++) {
				if (visit[j]) // i정점에서 dfs로 방문했던 정점들에 1을 저장
					answer[i][j] = 1;
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
