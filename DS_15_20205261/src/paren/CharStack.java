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
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public void remove() {
		if(top == null) {
			return;
		}
		else {
			top = top.link;
		}
	}
	
	public char peek() {
		if(top == null) {
			return 0;
		}
		else {
			return top.data;
		}
	}

}
