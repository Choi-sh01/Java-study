package ex;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial1(5));
		System.out.println(factorial2(5));
	}

	public static int factorial1(int number) {
		if(number<=1) {
			return 1;
		}
		else {
			return number*factorial1(number-1);
		}
	}

	public static int factorial2(int number) {
		int result = 1;
		for(int i = number; i>0; i--) {
			result *= i;
		}
		return result;
	}
}
