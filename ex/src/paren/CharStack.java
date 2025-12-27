package paren;

public class CharStack {
	private CharNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char x) {
		CharNode node = new CharNode();
		node.data = x;
		node.link = top;
		top = node;
	}
	
	public char pop() {
		if(top == null) {
			return 0;
		}
		char item = top.data;
		top = top.link;
		return item;
	}
	
	public void remove() {
		if(top == null) {
			return;
		}
		top = top.link;
	}
	
	public char peek() {
		if(top == null) {
			return 0;
		}
		return top.data;
	}

}
