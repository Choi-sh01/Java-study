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
		ListNode node = new ListNode(name, first);
		first = node;
		length++;
	}
	
	public void print() {
		ListNode target = first;
		while(target !=null) {
			System.out.println(target.getName());
			target = target.getLink();
		}
	}
	
	public ListNode searchNode(String name) {
		ListNode node = first;
		while(node != null) {
			if(node.getName().equals(name)) {
				return node;
			}
			node = node.getLink();
		}
		return null;
	}
	
	public void insert(String name, ListNode target) {
		if(target == null) {
			addFirst(name);
			length++;
		}
		else {
			ListNode node = new ListNode(name, target.getLink());
			target.setLink(node);
			length++;
		}
	}
	public void insertFront(String name, ListNode target) {
		
	}
	
	public void delete(ListNode p) {
		ListNode node = first;
		while(node != null) {
			if(node == p.getLink()) {
				p.setLink(node.getLink());
			}
			node = node.getLink();
		}
		length--;
	}
	
	public void invert() {
		ListNode node = first;
		ListNode nextNode = null;
		ListNode temp;
		while(node != null) {
			temp = nextNode;
			nextNode = node;
			node = node.getLink();
			nextNode.setLink(temp);
		}
		first = nextNode;
	}
}
