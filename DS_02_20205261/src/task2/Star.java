package task2;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int max = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			int input = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
			if (input < 0) {
				break;
			}
		}
	}
}
