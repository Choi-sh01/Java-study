package recursion;

public class Sqrt {
	
	public static void main(String[] args) {
		System.out.println(sqrt(2));
		System.out.println(sqrt(4));

	}
	
	public static double sqrt(double target) {
		return sqrt(target, 1, 6);
	}

	private static double sqrt(double target, double x,  int precision) {
		if(precision==0) {
			return x;
		}
		double n = (x+target/x)/2;
		
		return sqrt(target,n,precision-1);
	}
	
}
