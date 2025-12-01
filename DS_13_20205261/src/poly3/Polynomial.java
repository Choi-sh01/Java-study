package poly3;

public class Polynomial {
	private PolyNode firstNode;
	private PolyNode lastNode;
	
	public Polynomial() {
		firstNode = null;
		lastNode = null;
	}
	
	public boolean ispZero() {
		return firstNode == null;
	}
	
	public void addTerm(int c, int e) {
		   if (c == 0) return;

	        PolyNode p = firstNode;
	        PolyNode q = null;

	        while (p != null && p.exp > e) {
	            q = p;
	            p = p.link;
	        }

	        if (p != null && p.exp == e) {
	            p.coef += c;

	            if (p.coef == 0) delTerm(e);
	            return;
	        }

	        PolyNode newNode = new PolyNode(c, e);

	        if (q == null) {
	            newNode.link = firstNode;
	            firstNode = newNode;
	            if (lastNode == null) lastNode = newNode;
	        }
	        else {
	            newNode.link = p;
	            q.link = newNode;
	            if (p == null) lastNode = newNode;
	        }
	    }
	
	
	public void delTerm(int e) {
		PolyNode p = firstNode, q = null;

        while (p != null && p.exp != e) {
            q = p;
            p = p.link;
        }
        if (p == null) return;

        if (q == null) firstNode = p.link;
        else q.link = p.link;

        if (p == lastNode) lastNode = q;
	}
	
	public Polynomial sMult(int c, int e) {
		Polynomial result = new Polynomial();
        PolyNode p = firstNode;

        while (p != null) {
            result.appendTerm(p.coef * c, p.exp + e);
            p = p.link;
        }
        return result;
	}
	
	public Polynomial polyMult(Polynomial q) {
		Polynomial result = new Polynomial();

        for (PolyNode p = firstNode; p != null; p = p.link) {
            for (PolyNode r = q.firstNode; r != null; r = r.link) {
                result.addTerm(p.coef * r.coef, p.exp + r.exp);
            }
        }

        return result;
	}
	
	public void appendTerm(int c, int e) {
		if (c == 0) return;

        PolyNode newNode = new PolyNode(c, e);

        if (firstNode == null) {
            firstNode = lastNode = newNode;
        } else {
            lastNode.link = newNode;
            lastNode = newNode;
        }
	}
	
	public Polynomial polyAdd(Polynomial poly) {
		Polynomial result = new Polynomial();
        PolyNode p = firstNode;
        PolyNode q = poly.firstNode;

        while (p != null && q != null) {
            if (p.exp == q.exp) {
                result.addTerm(p.coef + q.coef, p.exp);
                p = p.link;
                q = q.link;
            }
            else if (p.exp > q.exp) {
                result.addTerm(p.coef, p.exp);
                p = p.link;
            }
            else {
                result.addTerm(q.coef, q.exp);
                q = q.link;
            }
        }

        while (p != null) {
            result.addTerm(p.coef, p.exp);
            p = p.link;
        }
        while (q != null) {
            result.addTerm(q.coef, q.exp);
            q = q.link;
        }

        return result;
	}
	
	public void print() {
		PolyNode p = firstNode;
		while(p != null) {
			System.out.print(p.coef + "x^" + p.exp + " + ");
			p = p.link;
		}
		System.out.println();
	}

}
