package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int textQtt = scan.nextInt();
		int textSize = scan.nextInt();
		
		int hammingDistance = 0;
		
		String[] dna = new String[textQtt];
		for(int i=0; i<textQtt; i++) {
			dna[i] = scan.next();
		}
		
		String hDna = "";
		
		for(int i=0; i<textSize; i++) {
			int max=0;
			int a=0, t=0, g=0, c=0;
			for(int j=0; j<textQtt; j++) {
				switch(dna[j].charAt(i)) {
				case 'A':
					a++;
					break;
				case 'T':
					t++;
					break;
				case 'G':
					g++;
					break;
				case 'C':
					c++;
					break;
				default:
					break;
				}
			}
			max = Math.max(c,Math.max(g,Math.max(t, a)));
			hammingDistance += (textQtt - max);
			if(max == a) {
				hDna += "A";
//				System.out.print("A");
			}else if(max == t) {
				hDna += "T";
//				System.out.print("T");
			}else if(max == g) {
				hDna += "G";
//				System.out.print("G");
			}else if(max == c){
				hDna += "C";
//				System.out.print("C");
			}
			
			
		}
		System.out.println(hDna);
		System.out.println(hammingDistance);
		
		scan.close();
	}
}
