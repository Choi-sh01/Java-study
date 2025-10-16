package recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial1(5));
		System.out.println(factorial2(5));
	}


	public static int factorial1(int number) {
		if(number <= 1) {
			return 1;
		}
		else {
			int n = number * factorial1(number-1);
			return n;
		}
	}
	
	public static int factorial2(int number) {
		int n = 1;
		for(int i = 1; i<=number; i++) {
			n *= i;
		}
		return n;
	}
}
