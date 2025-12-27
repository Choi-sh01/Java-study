package ex;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
