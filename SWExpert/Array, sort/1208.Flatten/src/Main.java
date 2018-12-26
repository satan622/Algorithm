import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];

		int dump[] = new int[10];
		int dif[] = new int[10];

		// 입력
		

		int max;
		int min;
		int maxIndex, minIndex;
		for (int k = 0; k < 10; k++) {
			dif[k] = 0;
			dump[k] = scan.nextInt();
			for (int x = 0; x < arr.length; x++) {
				arr[x] = scan.nextInt();
			}
			for (int i = 0; i < dump[k]; i++) {
				max = arr[0];
				min = arr[0];
				maxIndex = 0;
				minIndex = 0;
				for (int j = 1; j < 100; j++) {
					if (max < arr[j]) {
						max = arr[j];
						maxIndex = j;
					}
					if (min > arr[j]) {
						min = arr[j];
						minIndex = j;
					}
				}
				arr[maxIndex]--;
				arr[minIndex]++;
			}

			// 최종 덤프 수행 후, 최고점과 최저점 높이차 반환.
			max = arr[0];
			min = arr[0];
			for (int j = 1; j < 100; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
				if (min > arr[j]) {
					min = arr[j];
				}
				dif[k] = max - min;
			}
		}
		
		for(int k=0;k<10; k++) {
			System.out.println(dif[k]);
		}
	}
}
