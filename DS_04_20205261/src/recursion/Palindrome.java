package recursion;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("abba : " + isPalin("abba"));
		System.out.println("abcba : " + isPalin("abcba"));
		System.out.println("abba : " + isPalin("accba"));
	}
	private static boolean isPalin(String s, int j, int k) {
		if(j>=k) {
			return true;
		}
		else {
			if(s.charAt(j) == s.charAt(k)) {
				return isPalin(s, j+1, k-1);
			}
			else {
				return false;
			}
		}
	}
	
	public static boolean isPalin(String s) {
		return isPalin(s, 0, s.length() - 1);
	}

}
