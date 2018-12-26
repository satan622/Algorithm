package main;

public class Main {
    public static void main(String[] args) {
    	int counter = 0; //나눗셈 수행 횟수
    	int ptr = 0; //찾은 소수의 개수
    	int[] prime = new int[500]; //소수 저장 배열
    	
    	prime[ptr++] = 2; //소수 2를 prime 배열에 저장
    	prime[ptr++] = 3; //소수 3을 prime 배열에 저장
    	
    	for(int n=5; n<=1000; n+=2) {
    		boolean flag = false; //나누어 떨어지는지 판별하는 변수
    		for(int i=1; prime[i] * prime[i] <= n; i++) {
    			counter += 2;
    			if(n % prime[i] == 0) { //현재까지 찾은 소수로 나누어 떨어지면 소수 아님
    				flag = true;
    				break;
    			}
    		}
    		
    		if(!flag) { //마지막까지 나누어 떨어지지 않을 경우 소수
    			prime[ptr++] = n; //prime 배열에 소수를 저장
    			counter++;
    		}
    	}
    	
    	for(int i=0; i<ptr; i++) {
    		System.out.println(prime[i]);
    	}
    	
    	System.out.println("곱셈과 나눗셈 수행 횟수: " + counter);
    }
}