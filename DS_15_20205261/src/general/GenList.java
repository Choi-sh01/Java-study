package general;

public class GenList {
	private ListNode head;

	public void insertData(Object x) {
		ListNode node = new ListNode();
		node.data = x;
		node.link = head;
		head = node;
	}

	public void printGL() {
		System.out.print("(");
		ListNode target = head;
		while (target != null) {
			if (target.data instanceof GenList) {
				((GenList) target.data).printGL();
			} else {
				System.out.print(target.data);
			}
			if ((target = target.link) != null) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	public GenList copy() {
		GenList gn = new GenList();
		gn.head = theCopy(head);
		return gn;
	}

	private ListNode theCopy(ListNode h) {
		ListNode p = null;
		Object q;
		if (h != null) {

			if (h.data instanceof GenList) {
				q = ((GenList) h.data).copy();
			} else {
				q = h.data;
			}

			ListNode r = theCopy(h.link);
			p = new ListNode();
			p.data = q;
			p.link = r;
		}
		return p;
	}
	
	public boolean equal(GenList T) {
		return theEqual(this.head, T.head);
	}
	
	private boolean theEqual(ListNode s, ListNode t) {
		boolean b = false;
	    if (s == null && t == null) {
	    	return true;
	    }

	    if(s != null && t != null) {
	    	if(s.data instanceof GenList && t.data instanceof GenList) {
	    		b = theEqual(((GenList)s.data).head, ((GenList)t.data).head);
	    		
	    		

	    	} else {
	    		b = s.data.equals(t.data);
	    	}
	    }
	    
		if(b) {
			return theEqual(s.link, t.link);
		}
	    return b;
	}

	
	public int depth() {
		return theDepth(head);
	}
	
	private int theDepth(ListNode h) {
	    if (h == null) return 0;

	    int max = 0;
	    ListNode p = h;

	    while (p != null) {
	        int d;

	        if (p.data instanceof GenList) {
	            d = ((GenList) p.data).depth();
	        } else {
	            d = 0;
	        }

	        if (d > max) {
	        	max = d;
	        	
	        }
	        p = p.link;
	    }

	    return max + 1; 
	}

}
