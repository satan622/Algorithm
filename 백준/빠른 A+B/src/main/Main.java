package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(input.readLine());
		String num;
		int sum, a, b;
		
		for(int i=0; i<n; i++) {
			num = input.readLine();
			
			a = Integer.parseInt(num.split(" ")[0]);
			b = Integer.parseInt(num.split(" ")[1]);
			sum = a + b;
			System.out.println(sum);
		}
		
		out.flush();
		input.close();
		out.close();
	}
}