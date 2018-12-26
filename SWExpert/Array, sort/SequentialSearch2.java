public class Main {
	public static void main(String[] args) {
		int[] a = {2, 4, 7, 9, 11, 19, 23}; //정렬되지 않은 Array
		int key = 11; //찾고자 하는 수
		
		//sequentialSearch 메소드의 결과를 저장.
		int result = sequentialSearch(a, key);
		System.out.println(result);
	}
	
	//순차 탐색 메소드
	//현재 인덱스의 값이 키 값보다 크면 -1을 반환
	//탐색을 성공하면 인덱스 번호를 반환하고 값이 없으면 -1을 반환
	public static int sequentialSearch(int[] a,int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i] > key) {
				return -1;
			}else if(a[i] == key){
				return i;
			}
		}
		return -1;
	}
}