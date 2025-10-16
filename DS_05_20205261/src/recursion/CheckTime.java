package recursion;

public class CheckTime {
	public static final int MAX_N = 40;
	public static void main(String[] args) {
		
		long beforeTime = System.currentTimeMillis(); 
        
		for(int i = 0; i <= MAX_N; i++)
			fib_1(i);
		
		long afterTime = System.currentTimeMillis(); 
		
		System.out.println("재귀함수 : " + (double)(afterTime - beforeTime) / 1000 + "s");
		
		 beforeTime = System.currentTimeMillis(); 
        
		for(int i = 0; i <= MAX_N; i++)
			fib_2(i);
		
		 afterTime = System.currentTimeMillis(); 
		
		System.out.println("반복문 : " + (double)(afterTime - beforeTime) / 1000 + "s");

	}

	public static int fib_1(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib_1(n - 1) + fib_1(n - 2);
		}
	}
	
	
	public static int fib_2(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
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
/*
	반복문은 단순히 반복문 안에서 변수를 계속 갱신하면서 실행되는데에 반면, 
	재귀함수는 매번 함수를 호출하면서 변수, 주소 등이 수행되기 때문에 
	일반적으로 재귀함수가 반복문보다 느립니다.
*/