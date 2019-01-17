import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] adMatrix;
	static boolean[] visit;

	// 재귀호출을 이용한 dfs구현
	public static void dfs(int n, int v) {
		System.out.print(v + " ");
		visit[v - 1] = true;
		for (int i = 0; i < n; i++) {
			if (adMatrix[v - 1][i] == 1 && !visit[i]) {
				dfs(n, i + 1);
			}
		}
	}

	// 큐를 이용한 bfs 구현
	private static void bfs(int n, int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visit[v - 1] = true;

		while (!q.isEmpty()) {
			int next = q.poll();
			System.out.print(next + " ");
			for (int i = 0; i < n; i++) {
				if (adMatrix[next - 1][i] == 1 && !visit[i]) {
					q.offer(i + 1);
					visit[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 시작 위치

		adMatrix = new int[n][n];
		for (int i = 0; i < m; i++) { // 간선 수에 맞게 정점간 연결 입력
			int vertext1 = sc.nextInt();
			int vertext2 = sc.nextInt();

			// 인접 행렬에 1 저장
			adMatrix[vertext1 - 1][vertext2 - 1] = 1;
			adMatrix[vertext2 - 1][vertext1 - 1] = 1;
		}

		visit = new boolean[n];
		dfs(n, v);
		System.out.println();

		visit = new boolean[n];
		bfs(n, v);

		sc.close();
	}
}
