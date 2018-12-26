
public class Main {
	public static void main(String[] args) {
		int[] data = { 0, 4, 1, 3, 1, 2, 4, 1 };
		int[] counts = new int[5];
		int[] temp = new int[data.length];

		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
			for (int j = 0; j < data.length; j++) {
				if(data[j] == i) counts[i]++;
			}
		}
		for(int i=0; i<counts.length-1; i++) {
			counts[i+1] += counts[i];
		}
		
		System.out.println("counts배열");
		for(int i=0; i<counts.length; i++) {
			System.out.print(counts[i] + " ");
		}
		System.out.println();
		
		System.out.println("정렬 된 배열");
		for(int i=data.length-1; i>0; i--) {
			counts[data[i]]--;
			temp[counts[data[i]]] = data[i];
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
	}
}
