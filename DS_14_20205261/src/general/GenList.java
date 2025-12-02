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
		while(target != null) {
			if(target.data instanceof GenList) {
				((GenList) target.data).printGL();
			}
			else {
				System.out.print(target.data);
			}
			if((target = target.link) != null) {
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
		if(h != null) {
			
			if(h.data instanceof GenList) {
				q = ((GenList) h.data).copy();
			}
			else {
				q= h.data;
			}
				
				ListNode r = theCopy(h.link);
				p = new ListNode();
				p.data = q;
				p.link = r;
			
		} 

			
		return p;
	}

}
