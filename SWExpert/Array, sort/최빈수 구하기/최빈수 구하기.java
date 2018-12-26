import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tc = 10;
		int[] max = new int[tc];
		for(int x=0; x<tc; x++) {
			max[x] = 0;
		}
		
		for (int x = 0; x < tc; x++) {
			int tcNum = scan.nextInt();
			int[] scores = new int[1000];
			int[] scoresNum = new int[101];
			int maxCount = Integer.MIN_VALUE;
			for (int i = 0; i < scores.length; i++) {
				scores[i] = scan.nextInt();
			}
			Arrays.sort(scores);

			for (int j = 0; j < scoresNum.length; j++) {
				scoresNum[j] = 0;
			}

			for (int j = 0; j < scoresNum.length; j++) {
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] == j)
						scoresNum[j]++;
				}
				if (scoresNum[j] > maxCount) {
					maxCount = scoresNum[j];
					max[x] = j;
				}
			}
		}
		
		for(int x=0; x<tc; x++) {
			System.out.println("#" + (x+1) + " " + max[x]);
		}
	}
}
