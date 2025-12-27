package ex;

import java.util.Scanner;

public class TestArray4 {
	public static final int ARRAY_MAX = 30;

	public static void main(String[] args) {
		int[] array1 = new int[ARRAY_MAX];
		int input, total = 0, size = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array1.length; i++) {
			input = sc.nextInt();
			if (input < 0) {
				break;
			}
			array1[size] = input;
			size++;

		}
		sc.close();

		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = 0; j < array1.length - 1 - i; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}

		System.out.print("[");
		for (int i = 0; i < array1.length; i++) {
			if (i == array1.length - 1) {
				System.out.print(array1[i]);
			} 
			else {
				System.out.print(array1[i] + ", ");
			}
		}
		System.out.print("]");
	}
}
