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
	
	public void delete(ListNode p) {
		ListNode node = first;
		if(p==null) {
			return;
		}
		else {
			node = p.getLink();
			if(node == null) {
				return;
			}
			p.setLink(node.getLink());
			length--;
		}
	}
	
	public void invert() {
		ListNode p = first;
		ListNode q = null;
		ListNode r;
		while(p != null) {
			r = q;
			q = p;
			p = p.getLink();
			q.setLink(r) ;
		}
		first = q;
	}
	
	public static LinkedList concatList(LinkedList list1, LinkedList list2) {
		if(list1.length == 0) {
			return list2;
		}
		else if(list2.length == 0) {
			return list1;
		}
		else {
			ListNode p = list1.first;
			while(p.getLink() != null) {
				p = p.getLink();
			}
			p.setLink(list2.first);
			list1.length = list1.length() + list2.length();
			return list1;
		}
	}
	
	public void append(String name) {
		ListNode node = new ListNode(name);
		ListNode p = first;
		while(p.getLink() != null) {
			p = p.getLink();
		}
		node.setLink(p.getLink());
		length++;
	}
	
	public void deleteLastNode() {
		ListNode pre = first;
		ListNode cur;
		if(pre == null) {
			return;
		}
		if(pre.getLink() == null) {
			pre = null;
		}
		else {
			cur = pre.getLink();
			while(cur.getLink() != null) {
				pre = cur;
				cur = cur.getLink();
			}
			pre.setLink(null);
			length--;
		}
		
	}
	
	public void print() {
		ListNode node = first;
		/*
		for(int i = 0; i<length; i++) {
			System.out.println(node.getName());
			node = node.getLink();
		}
		*/
		while( node != null) {
			System.out.println(node.getName());
			node = node.getLink();
		}
	}

}
