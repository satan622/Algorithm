import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] coin = {500, 250, 100, 50, 10};
		int[] count = new int[5];
		int money = scan.nextInt();
		
		int i=0;
		while(money>0) {
			if(money>=coin[i]) {
				money -= coin[i];
				count[i]++;
			}else {
				i++;
			}
		}
		
		for(i=0; i<5; i++) {
			System.out.println(coin[i] + " = " + count[i]);
		}
	}
}
