import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] adList; // 인접 리스트
	static ArrayList<Integer> visitList = new ArrayList<>(); // 방문한 정점을 순서대로 저장

	// 재귀호출을 이용한 dfs구현
	public static void dfs(int v) {
		System.out.print(v + " "); // 현재 정점 출력
		visitList.add(v); // 현재 정점을 방문 리스트에 저장
		for (int i = 0; i < adList[v - 1].size(); i++) { // 현재 정점에 인접한 정점들을 담은 리스트를 탐색
			if (!visitList.contains(adList[v - 1].get(i))) { // 인접 정점으로 이동해 방문 리스트에 없으면 재귀 호출 방문했다면 다른 인접 정점으로 이동
				dfs(adList[v - 1].get(i));
			}
		}
	}

	// 큐를 이용한 bfs 구현
	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v); // 시작 정점을 큐에 저장
		visitList.add(v); // 시작 정점을 방문 리스트에 추가

		while (!q.isEmpty()) { // 큐의 모든 정점을 디큐하여 큐가 비면 탐색 완료
			int now = q.poll(); // 현재 정점을 디큐하여 변수에 저장
			System.out.print(now + " ");
			for (int i = 0; i < adList[now - 1].size(); i++) { // 현재 정점에 인접한 정점들 탐색
				if (!visitList.contains(adList[now - 1].get(i))) { // 방문하지 않은 정점일 경우 큐에 저장하고 방문 리스트에 저장
					q.offer(adList[now - 1].get(i));
					visitList.add(adList[now - 1].get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // dfs 시작 위치

		adList = new ArrayList[n]; // 리스트를 배열로 선언하여 인접 리스트 구현

		for (int i = 0; i < n; i++) {
			adList[i] = new ArrayList<>(); // 각 정점마다 인접한 정점을 표현한 리스트 생성
		}

		// 정점간 연결
		for (int i = 0; i < m; i++) {
			int vertex1 = sc.nextInt();
			int vertex2 = sc.nextInt();

			// 방향이 없는 그래프이므로 양쪽에 각각 연결
			adList[vertex1 - 1].add(vertex2);
			adList[vertex2 - 1].add(vertex1);
		}

		dfs(v); // dfs 호출
		System.out.println();

		visitList.clear(); // 방문 리스트 초기화

		bfs(v); // bfs 호출

		sc.close();
	}
}
