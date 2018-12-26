import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //사람 수 N
		int[] line = new int[n]; //서야하는 줄

		for(int i=0; i<n; i++) {
			int left = sc.nextInt(); //자신의 왼쪽에 있는 자신보다 큰 사람 수
			int count = 0; //line[i]가 비어있는지 확인하기 위한 카운터
			
			for(int j=0; j<n; j++) {
				if(line[j] == 0) {
					if(count >= left) { //line[0] ~ line[j]의 앞의 빈 칸의 수가 left보다 크거나 같으면 line[j]에 i+1 대입 
						line[j] = i + 1;
						break;	
					}
					count++; //line[j]가 비어있으면 count 증가
				}
			}
		}
		
		for (int i = 0; i < line.length; i++) {
			System.out.print(line[i] + " ");
		}

		sc.close();
	}
}
