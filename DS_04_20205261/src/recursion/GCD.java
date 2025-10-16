package recursion;

public class GCD {
	public static void main(String[] args) {
		System.out.println("36, 12: " + gcd(36, 12));
		
	}
	
	public static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		else {
			int n = a%b;
			return gcd(b,n);
		}
	}

}
