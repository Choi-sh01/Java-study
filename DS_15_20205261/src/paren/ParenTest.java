package paren;

public class ParenTest {
	
	public static void main(String[] args) {
		System.out.println(Paren.check("{1 + 7 * [3 + 3 / (3 - 1) + 7]}"));
		System.out.println(Paren.check("{1 + 7 * [3 + 3 / (3 - 1) + 7}"));
	}

}
