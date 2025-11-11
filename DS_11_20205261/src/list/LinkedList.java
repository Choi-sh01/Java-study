package list;

public class LinkedList {
	private int length;
	private ListNode first;
	
	public LinkedList() {
		length = 0;
		first = null;
	}
	
	public int length() {
		return length;
	}
	
	public ListNode firstNode() {
		return first;
	}
	
	public void addFirst(String name) {
		ListNode node = new ListNode(name,first);
		//ode.setLink();
		first = node;
		length++;
	}
	
	public void insert(String name, ListNode target) {
		if (target == null) {
			addFirst(name);
			return;
		}
		ListNode node = new ListNode(name);
		node.setLink(target.getLink());
		target.setLink(node);
		length++;
	}
	
	public ListNode searchNode(String name) {
		ListNode node = first;
		for(int i = 0; i<length; i++) {
			if (node.getName().equals(name)) {
				return node;
			}
			node = node.getLink();
		}
		return null;
	}
	
	public void print() {
		ListNode node = first;
		for(int i = 0; i<length; i++) {
			System.out.println(node.getName());
			node = node.getLink();
		}
	}

}
