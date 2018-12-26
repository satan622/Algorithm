package main;

public class Main {
    public static void main(String[] args) {
    	int counter = 0; //나눗셈 수행 횟수
    	int ptr = 0; //찾은 소수의 개수
    	int[] prime = new int[500]; //소수 저장 배열
    	
    	prime[ptr++] = 2; //소수 2를 prime 배열에 저장
    	
    	for(int n=3; n<=1000; n+=2) { //짝수 중 소수는 2뿐이므로 홀수만 판단
    		int i;
    		for(i=1; i<ptr; i++) { //현재 찾은 소수 개수만큼 반복
    			counter++;
    			if(n % prime[i] == 0) { //이미 찾은 소수로 나누어 떨어지면 소수 아니므로 반복 종료
    				break;
    			}
    		}
    		if(ptr == i) { //i가 ptr값에 도달하면  모든 소수로 나누어 떨어지지 않았으므로 prime 배열에 저장
    			prime[ptr++] = n;
    		}
    	}
    	
    	for(int i=0; i<ptr; i++) { //prime 배열에 들어있는 모든 소수 출력
    		System.out.println(prime[i]);
    	}
    	
    	System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}