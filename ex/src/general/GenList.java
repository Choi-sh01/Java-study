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
		System.out.print
	}
	
	public GenList copy() {
		GenList gn = new GenList();
		gn.head = theCopy(head);
		return gn;
	}
	
	private ListNode theCopy(ListNode h) {
		
	}

}
