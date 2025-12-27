package ex;

public class Poly {
	private static final int MAX = 30;
	private int[] coef;
	private int degree;
	
	public Poly() {
		coef = new int[MAX];
		degree = 0;
	}
	public boolean isPZero() {
		return degree == 0;
	}
	public int coef(int e) {
		return coef[e];
	}
	public int maxExp() {
		return degree;
	}
	public boolean addTerm(int c, int e) {
		if(coef[e] != 0) {
			return false;
		}
		else {
			coef[e]=c;
			if(e>degree) {
				degree = e;
			}
			return true;
		}
	}
	public boolean delTerm(int e) {
		if(coef[e]==0) {
			return false;
		}
		else {
			coef[e] = 0;
			for(int i = degree; i>=0; i--) {
				if(coef[i] != 0) {
					degree = i;
					break;
				}
			}
			return true;
		}
	}
	public void printResult() {
		for(int i = degree; i>=0; i--) {
			if(coef[i] != 0) {
				if(i==0) {
					System.out.print(coef[i]);
				}
				else {
					System.out.print(coef[i]+"x^"+i+" + ");
				}
			}
		}
		System.out.println();
	}
	public Poly sMult(int c, int e) {
		Poly poly = new Poly();
		for(int i = 0; i<=degree; i++) {
			if(coef[i] == 0) {
				continue;
			}
			poly.coef[i+e] = coef[i]*c;
		}
		for(int i = poly.coef.length-1; i>=0; i--) {
			if(poly.coef[i] != 0) {
				poly.degree = i;
				break;
			}
		}
		return poly;
	}
	public Poly polyAdd(Poly poly1) {
		Poly poly = new Poly();
		for(int i = 0; i<coef.length; i++) {
			if(coef[i]==0 && poly.coef[i] == 0) {
				continue;
			}
			poly.coef[i] = coef[i]+poly1.coef[i];
		}
		for(int i = poly.coef.length-1; i>=0; i--) {
			if(poly.coef[i] != 0) {
				poly.degree = i;
				break;
			}
		}
		return poly;
	}
	public Poly polyMult(Poly poly1) {
		Poly poly = new Poly();
		for(int i = 0; i<coef.length; i++) {
			if(coef[i]==0 && poly.coef[i] == 0) {
				continue;
			}
			Poly temp = poly1.sMult(coef[i],i);
			poly = poly.polyAdd(temp);
			}
		return poly;
		}
	}

