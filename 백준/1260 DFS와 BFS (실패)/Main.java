import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<ArrayList<Integer>> adList; // 인접 리스트
	static List<Integer> visitList = new ArrayList<>(); // 방문한 정점을 순서대로 저장

	// 재귀호출을 이용한 dfs구현
	public static void dfs(int v) {
		visitList.add(v); // 정점을 방문 리스트에 추가
		for (int i = 0; i < adList.get(v - 1).size(); i++) {
			if (!visitList.contains(adList.get(v - 1).get(i))) { // 인접 리스트의 항목이 방문한 리스트에 없다면 재귀 호출
				dfs(adList.get(v - 1).get(i));
			}
		}
	}

	// 큐를 이용한 bfs 구현
	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v); // 시작 정점을 큐에 저장
		visitList.add(v); // 시작 정점을 방문 리스트에 추가

		while (!q.isEmpty()) { // 큐가 모두 비면 반복 종료 (탐색 완료)
			v = q.poll(); // 큐 헤드에 있는 정점 값을 디큐
			for (int i = 0; i < adList.get(v - 1).size(); i++) { // 현재 정점에 인접한 정점들 탐색
				if (!visitList.contains(adList.get(v - 1).get(i))) { // 방문하지 않은 정점일 경우 큐에 저장하고 방문 리스트에 저장
					q.offer(adList.get(v - 1).get(i));
					visitList.add(adList.get(v - 1).get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int dv = sc.nextInt(); // dfs 시작 위치
		int bv = dv; // bfs 시작 위치

		adList = new <ArrayList<Integer>>ArrayList(); // 인접 리스트

		for (int i = 0; i < n; i++) {
			adList.add(new <Integer>ArrayList()); // 리스트에 담을 리스트 생성(각 정점마다 인접한 정점을 표현한 리스트)
		}

		// 정점간 연결
		for (int i = 0; i < m; i++) {
			int vertex1 = sc.nextInt();
			int vertex2 = sc.nextInt();
			adList.get(vertex1 - 1).add(vertex2);
			adList.get(vertex2 - 1).add(vertex1);
		}

		dfs(dv); // dfs 호출
		for (int i = 0; i < visitList.size(); i++) { // dfs로 검색되는 정점의 순서 출력
			System.out.print(visitList.get(i) + " ");
		}
		System.out.println();

		visitList.clear(); // 방문 리스트 초기화

		bfs(bv); // bfs 호출
		for (int i = 0; i < visitList.size(); i++) { // bfs로 탐색한 정점들을 차례로 출력
			System.out.print(visitList.get(i) + " ");
		}
		System.out.println();

		sc.close();
	}
}
