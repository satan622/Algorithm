
public class Main {
	public static void main(String[] args) {
		int[] arr = {3, 1, 5, 4, 2};
		
		//배열 출력
		for(int k=0; k<arr.length; k++)
			System.out.print(arr[k]+ " ");
		System.out.println();
		
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			
			for(int j=i; j>0; j--) {
				if(arr[j-1] > key) {//key값 보다 [현재위치 -1]의 값이 더 클 경우
					arr[j] = arr[j-1]; //[현재위치]에 [현재위치-1]의 값을 삽입
					if(j==1) {//더이상 비교할 대상이 없으므로 [현재위치]에 key값을 삽입
						arr[j-1] = key; 
					}
				}else {//[현재위치-1]이 key값보다 작거나 같은 경우  
					arr[j] = key; //[현재위치]에 key값을 삽입
					break; //key값이 정렬되었으므로 다음 값을 비교
				}
			}
			
			//키값 하나를 정렬할 때마다 결과 출력
			for(int k=0; k<arr.length; k++)
				System.out.print(arr[k]+ " ");
			System.out.println();
		}
		
	}
}
