package poly_term;


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
		//terms[0].getExp();
		return noOfTerms;
	}

	public void addTerm(int c, int e) {
		if (noOfTerms == 0) {
			terms[noOfTerms] = new Term(c, e);
			noOfTerms++;
		} else {
			int find = noOfTerms;
			for (int i = 0; i < noOfTerms; i++) {
				if (e > terms[i].getExp()) {
					find = i;
					break;
				}
			}

			for (int j = noOfTerms; j > find; j--) {
				terms[j] = terms[j - 1];
			}

			terms[find] = new Term(c, e);
			noOfTerms++;
		}
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
			//poly.addTerm(terms[i].getCoef() * c, terms[i].getExp() + e);
			poly.terms[i] = new Term(terms[i].getCoef() * c, terms[i].getExp() + e);
			poly.noOfTerms++;
		}
		return poly;
	}

	public Poly_Term polyAdd(Poly_Term poly1) {
	    Poly_Term poly = new Poly_Term();

	    int i = 0, j = 0;

	    while (i < noOfTerms && j < poly1.noOfTerms) {
	        Term t1 = terms[i];
	        Term t2 = poly1.terms[j];

	        if (t1.getExp() == t2.getExp()) { 
	            poly.addTerm(t1.getCoef() + t2.getCoef(), t1.getExp());
	            i++;
	            j++;
	        } else if (t1.getExp() > t2.getExp()) { 
	            poly.addTerm(t1.getCoef(), t1.getExp());
	            i++;
	        } else { 
	            poly.addTerm(t2.getCoef(), t2.getExp());
	            j++;
	        }
	    }

	    while (i < noOfTerms) {
	        Term t1 = terms[i++];
	        poly.addTerm(t1.getCoef(), t1.getExp());
	    }
	    while (j < poly1.noOfTerms) {
	        Term t2 = poly1.terms[j++];
	        poly.addTerm(t2.getCoef(), t2.getExp());
	    }

	    return poly;
	}

	public Poly_Term polyMult(Poly_Term poly1) {
		Poly_Term poly = new Poly_Term();
		for (int i = 0; i <= noOfTerms; i++) {
			if (terms[i] == null && poly1.terms[i] == null) {
				continue;
			}
			Poly_Term temp = poly1.sMult(terms[i].getCoef(), terms[i].getExp());
			poly = poly.polyAdd(temp);
		}
		return poly;
	}

	public void printResult() {
		for (int i = 0; i < noOfTerms; i++) {
			if (terms[i] == null) {
				continue;
			}
			if (i == noOfTerms - 1) {
				System.out.print(terms[i].getCoef());
			} else {
				System.out.print(terms[i].getCoef() + "x^" + terms[i].getExp() + " + ");
			}
		}
		System.out.println();
	}

}
