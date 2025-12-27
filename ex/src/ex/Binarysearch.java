package ex;

public class Binarysearch {
	public static void main(String[] args) {
		int array1 [] = {1, 6, 13, 41, 45, 68, 70, 74, 81, 100};
		int array2 [] = {100, 68, 13, 41, 45, 6, 70, 74, 81, 1};
		System.out.println("array1에서 68의 위치 : " + search(array1, 68));
		System.out.println("array2에서 68의 위치 : " + search(array2, 68));
	}
	
	public static int search(int a [], int key) {
		if(a[0] > a[1]) {
			System.out.println("ERROR : 배열이 정령되어 있지 않습니다.");
			return -1;
		}
		else {
			return binarySearch(a, key, 0, a.length-1);
		}
	}
	private static int binarySearch(int array [], int key, int left, int right) {
		int mid  = (left+right)/2;
		
		if(array[mid] == key) {
			return mid;
		}
		else {
			if(array[mid] <key) {
				return binarySearch(array, key, mid+1, right);
			}
			else if (array[mid] >key) {
				return binarySearch(array, key, left, mid-1);
			}
		}
		return -1;
	}

}
