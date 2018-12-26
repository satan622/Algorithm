package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int no; //변환 할 정수
    	int cd; //기수
    	int dno; //변환 후 자릿수
    	int retry; //재 실행 여부
    	char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 배열
    	
    	System.out.println("10진수를 기수 변환합니다.");
    	do {
    		
    		do {
    			//변환 할 정수 입력
    			System.out.print("변환하는 음이 아닌 정수: ");
    			no = sc.nextInt();
    		}while(no < 0); //입력된 정수가 음수면 다시 입력
    		
    		do {
    			//몇 진수로 변환할지 입력
    			System.out.print("어떤 진수로 변환할까요? (2~36): ");
    			cd = sc.nextInt();
    		}while(cd < 2 || cd > 36); //입력 된 정수가 2~36이 아닐 경우 다시 입력
    		
    		dno = cardConvR(no, cd, cno); //no를 cd진수로 변환하여 cno 배열에 역순으로 저장, dno에는 변환된 자릿수 저장
    		
    		System.out.print(cd + "진수로는 ");
    		for(int i=dno-1; i>= 0; i--) {
    			//배열의 저장 된 수를 뒤에서부터 출력하여 진수를 출력
    			System.out.print(cno[i]);
    		}
    		System.out.println("입니다.");
    		
    		System.out.println("한 번 더 할까요(1.예/0.아니오): ");
    		retry = sc.nextInt();
    	}while(retry == 1); //retry가 1이면 다시 실행
    	
    	
    	sc.close();
    }

	private static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //x를 r로 나눈 나머지를 d의 배열에 저장
			x /= r; //x를 r로 나눈 몫을 x로 하여 반복
		}while(x != 0); //x가  0이 아니면 계속
		
		return digits; //변환한 값의 자릿수 반환
	}
}