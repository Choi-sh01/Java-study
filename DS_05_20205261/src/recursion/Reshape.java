package recursion;

import java.util.Arrays;

public class Reshape {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 2;
		array[3] = 4;
		array[5] = 8;
		int[] newArray = reshapeArray(array);

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));

	}

	public static int[] reshapeArray(int[] arr) {
		int zero_cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero_cnt++;
			}
		}
		int a = 0;
		int[] newArr = new int[arr.length - zero_cnt];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[a] = arr[i];
				a++;
			}
		}
		return newArr;
	}
}
