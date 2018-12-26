
public class Main {
	public static void main(String[] args) {
		
		int[] cards = {4,4,4,6,4,5};
		int[] count = new int[10];
		
		boolean triplete = false; // 3동일
		boolean run = false; // 3연속
		
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<cards.length; j++) {
				if(cards[j] == i) {
					count[i]++;
				}
			}
			if(count[i]>3) {
				count[i] -= 3;
				triplete = true;
			}
		}
		for(int i=0; i<count.length-2; i++) {
			if(count[i]>0 && count[i+1]>0 && count[i+2]>0) {
				run = true;
			}
		}
		
		if(triplete && run) {
			System.out.println("baby-gin");
		}else {
			System.out.println("fail");
		}
	}
}
