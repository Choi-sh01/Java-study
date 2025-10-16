package ex1;
import java.util.*;

public class TestArray2 {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4};
		
		System.out.println("Array length : "+array1.length);
		System.out.println(Arrays.toString(array1));
		
		array1 = newArray(array1);
		
		System.out.println("Array length : "+array1.length);
		System.out.println(Arrays.toString(array1));
	}
	public static int[] newArray(int[] array) {
		int[] arr = new int[array.length*2];
		for(int i = 0; i<array.length; i++) {
			arr[i]=array[i];
		}
		return arr;
	}

}
