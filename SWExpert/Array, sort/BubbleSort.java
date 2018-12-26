
public class Main {
	public static void main(String[] args) {
		int[] arr = {55, 7, 78, 12, 42};
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
