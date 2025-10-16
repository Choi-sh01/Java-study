package recursion;

public class GCD2 {
	
	public static void main(String[] args) {
		int[] array1 = {12, 36, 48, 24, 27};
	
		int[] array2 = new int[10];
		array2[0] = 2;
		array2[3] = 4;
		array2[5] = 8;
	
		System.out.println("Array 1 : " + multi_gcd(array1));
		System.out.println("Array 2 : " + multi_gcd(array2));
	}
	
	
	public static int multi_gcd(int[] array) {
		int cnt = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] != 0) {
				cnt++;
			}
		}
		
		int[] arr = new int[cnt];
		int n=0;
		for(int i = 0; i<array.length; i++) {
			if (array[n] != 0) {
				arr[i] = array[n];
				n++;
			}
		}
		
		if(arr.length == 1) {
			return arr[0];
		}
		
			
		while(arr[1] != 0) {
			int temp = arr[1];
			arr[1] = arr[0] % arr[1];
			arr[0] = temp;
		}
		int[] nextArr = new int[arr.length-1];
		nextArr[0] = arr[0];
		for( int i = 2; i<arr.length; i++) {
			nextArr[i-1] = arr[i];
		}
		return multi_gcd(nextArr);
	}
}
