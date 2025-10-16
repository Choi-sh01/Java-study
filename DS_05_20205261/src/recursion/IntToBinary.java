package recursion;

public class IntToBinary {
	public static void main(String[] args) {
		System.out.println(intToBinary(100));

	}
	
	private static String intToBinary(int n) {
		if(n==0) {
			return "";
		}
		else {
			int a = n/2;
			return intToBinary(a)+(n%2);
		}
	}
}
