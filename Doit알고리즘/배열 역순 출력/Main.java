package main;

public class Main {
    public static void main(String[] args) {
    	int[] arr = {5, 10, 73, 2, -5, 42};
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	
    	for(int i=0; i<arr.length/2; i++) {
    		int temp = arr[i];
    		arr[i] = arr[arr.length - i -1];
    		arr[arr.length - i - 1] = temp;
    	}
    	
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    }
}