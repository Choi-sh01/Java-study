package linkedstack;

public class LinkedStack {
	private ListNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(Object x) {
		ListNode node = new ListNode();
		node.data = x;
		node.link = top;
		top = node;
	}
	
	public Object pop() {
		if(top == null) {
			return null;
		}
		Object item = top.data;
		top = top.link;
		return item;
	}
	
	public void remove() {
		if(top == null) {
			return;
		}
		top = top.link;
	}
	
	public Object peek() {
		if(top == null) {
			return null;
		}
		return top.data;
	}

}
