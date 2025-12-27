package ex;

public class Poly_Term {
	private static final int MAX = 10;
	private Term[] terms;
	private int noOfTerms;

	public Poly_Term() {
		terms = new Term[MAX];
		noOfTerms = 0;
	}

	public boolean isPZero() {
		return noOfTerms == 0;
	}

	public int coef(int e) {
		for (int i = 0; i <= noOfTerms; i++) {
			if (terms[i].getExp() == e) {
				return terms[i].getCoef();
			}
		}
		return 0;
	}

	public int maxExp() {
		for (int i = noOfTerms; i >= 0; i--) {
			if (terms[i].getCoef() != 0) {
				noOfTerms = i;
				break;
			}
		}
		return noOfTerms;
	}

	public void addTerm(int c, int e) {
		if 이미 있는 차수 일 경우,
			terms.c += c <- 이게 0이 됐을 경우에는, term 삭제
			
		terms[noOfTerms] = new Term(c, e);
		noOfTerms++;
	}

	private int findIndex(int e) {
		for (int i = 0; i <= noOfTerms; i++) {
			if (terms[i].getExp() == e) {
				return i;
			}
		}
		return 0;
	}

	public void delTerm(int e) {

	}

	public Poly_Term sMult(int c, int e) {
		Poly_Term poly = new Poly_Term();
		for (int i = 0; i <= noOfTerms; i++) {
			if (terms[i] == null) {
				continue;
			}
			poly.terms[i] = new Term(terms[i].getCoef() * c, terms[i].getExp() + e);
			poly.noOfTerms++;
		}
		return poly;
	}

	public Poly_Term polyAdd(Poly_Term poly1) {
		Poly_Term poly = new Poly_Term();
		int len = 0;
		if (noOfTerms > poly1.noOfTerms) {
			len = noOfTerms;
		} else {
			len = poly1.noOfTerms;
		}
		for (int i = 0; i < len; i++) {
			if (terms[i].getExp() == poly1.terms[i].getExp()) {
				poly.terms[i] = new Term(terms[i].getCoef() + poly1.terms[i].getCoef(), terms[i].getExp());
			} else {
				poly.terms[i] = new Term(terms[i].getCoef() + poly1.terms[i].getCoef(), terms[i].getExp());
			}
			poly.noOfTerms++;
		}
		for (int j = 0; j < noOfTerms; j++) 
			poly.addTerm(this.terms[i].getCoef(), this.terms[i].getExp())
		for (int j = 0; j < noOfTerms; j++) 
			poly.addTerm(poly1.terms[i].getCoef(), poly1.terms[i].getExp())
		
		return poly;
	}

	public Poly_Term polyMult(Poly_Term poly1) {

	}

	public void printResult() {
		for (int i = noOfTerms; i >= 0; i--) {
			for (int j = 0; j < noOfTerms; j++) {
				if (terms[i] == null && terms[j] == null) {
					continue;
				}
				if (terms[j].getExp() == i && i == 0) {
					System.out.print(terms[j].getCoef());
				} else if (terms[j].getExp() == i) {
					System.out.print(terms[j].getCoef() + "x^" + i + " + ");
				}
			}
		}
		System.out.println();
	}

}