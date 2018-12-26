
public class Main {
	public static void main(String[] args) {
		// 이진 탐색
		int[] arr = { 2, 4, 7, 9, 11, 19, 23 };
		int key = 7;
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		for(;;) {
			mid = (left + right)/2;
			if(arr[mid] == key) {
				System.out.println(key + "발견");
				break;
			}else if(arr[mid] > key) {
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
	}
}
