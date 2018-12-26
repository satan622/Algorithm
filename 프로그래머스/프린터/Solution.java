import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int solution(int[] priorities, int location) {
		Queue<Integer> q = new LinkedList<>();
		
		for (int p : priorities) {
			q.offer(p);
		}

		int count = 0;

		while (!q.isEmpty()) {
			int item = q.poll(); //대기열의 맨 앞의 값을 item에 저장

			//q에서 item이 가장 큰 값인지 확인. 맞으면 true, 아니면 false
			boolean check = true; 
			for (int s : q) {
				if (item < s) {
					check = false;
				}
			}

			//item이 가장 큰 값이면 인쇄 count++, 아니면 item을 대기열 맨 뒤로 보냄
			if (check) {
				count++;
				if (location == 0)
					return count;
			} else {
				q.offer(item);
			}
			
			//정답 위치추적
			location--;
			if (location < 0) location += q.size();
		}
		
		return count;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] priorities = { 1, 2, 3, 4};
		int location = 1;

		int answer = sol.solution(priorities, location);
		System.out.println(answer);
	}
}
