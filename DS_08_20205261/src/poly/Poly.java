package poly;

public class Poly {
	private static final int MAX = 50;
	private int[] coef;
	private int degree;

	public Poly() {
		coef = new int[MAX];
		degree = 0;
	}

	public boolean isPZero() {
		if (coef[0] == 0) {
			return true;
		}
		return false;
	}

	public int coef(int e) {
		return coef[e];
	}

	public int maxExp() {
		return degree;
	}

	public boolean addTerm(int c, int e) {
		coef[e] = c;
	
		if(e>degree) {
			degree = e;
		}
		
		if (coef[e] != 0) {
			return false;
		}
		return true;
	}

	public boolean delTerm(int e) {
		coef[e] = 0;
		int max = 0;
		for(int i = 0; i<degree; i++) {
			if(coef[i]!=0 && i>max) {
				max = i;
			}
		}
		degree = max;
		if (coef[e] == 0) {
			return false;
		}
		return true;
	}

	public Poly sMult(int c, int e) {
		Poly poly = new Poly();
		for (int i = 0; i < coef.length; i++) {
			if (coef[i] == 0) {
				continue;
			}
			poly.coef[i + e] = coef[i] * c;
		}
		int max = 0;
		for (int i =0; i<coef.length; i++) {
			if(coef[i]!=0 && i>max) {
				max = i;
			}
		}
		poly.degree = max;
		return poly;
	}

	public Poly polyAdd(Poly poly1) {
		Poly poly = new Poly();
		for (int i = 0; i < coef.length; i++) {
			if (coef[i] == 0 && poly1.coef[i] == 0) {
				continue;
			}
			poly.coef[i] = coef[i] + poly1.coef[i];
		}
		int max = 0;
		for (int i =0; i<coef.length; i++) {
			if(coef[i]!=0 && i>max) {
				max = i;
			}
		}
		poly.degree = max;
		return poly;

	}

	public Poly polyMult(Poly poly1) {
		Poly poly = new Poly();
		for (int i = 0; i < coef.length; i++) {
			if (coef[i] == 0 && poly1.coef[i] == 0) {
				continue;
			}
			Poly temp = poly1.sMult(coef[i], i);
			poly = poly.polyAdd(temp);
		}

		return poly;
	}

	public void printResult() {
		for (int i = coef.length - 1; i >= 0; i--) {
			if (i == 0)
				System.out.print(coef[i]);
			else {
				if (coef[i] != 0) {
					System.out.print(coef[i] + "x^" + i + " + ");
				}
			}
		}
		System.out.println();
	}
}
