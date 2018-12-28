import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 사람 수
		
		People[] peoples = new People[n];
		for(int i=0; i<n; i++) {
			int weight = sc.nextInt();
			int height = sc.nextInt();
			peoples[i] = new People(weight, height);
		}

		int[] rank = new int[n];

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i == j) continue;
				
				boolean heavy = false;
				boolean tall = false;
				if (peoples[i].weight < peoples[j].weight)
					heavy = true;
				if (peoples[i].height < peoples[j].height)
					tall = true;
				if (heavy && tall) {
					count++;
				}
			}
			
			rank[i] = ++count;
			System.out.println(rank[i]);
		}

		sc.close();
	}
}

class People {
	int weight; // 몸무게
	int height; // 키

	public People(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

}