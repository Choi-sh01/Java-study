package ex;

public class Fibo {
	public static final int MAX_N = 10;
	public static void main(String[] args) {
		for(int i = 0; i<=MAX_N; i++) {
			System.out.println(fib(i));
		}
		System.out.println("--------------------");
		for(int i = 0; i<=MAX_N; i++) {
			System.out.println(fibIter(i));
		}
	}
		
		public static long fib(int n) {
			if(n<=0) {
				return 0;
			}
			else if(n==1) {
				return 1;
			}
			return fib(n-1)+fib(n-2);
			
		}
		
		public static long fibIter(int n) {
			if(n<=0) {
				return 0;
			}
			else if(n==1) {
				return 1;
			}
			else {
				int n1 = 0;
				int n2 = 1;
				int temp = 0;
				for (int i = 0; i < n; i++) {
					temp = n1 + n2;
					n2 = n1;
					n1 = temp;
				}
				return temp;
			}
		}
		
}
