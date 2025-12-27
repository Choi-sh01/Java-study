package arraystack;

public class ArrayStack {
	private int top;
	private int stackSize;
	private int increment;
	private Object[] itemArray;
	
	public ArrayStack() {
		top = -1;
		stackSize = 2;
		increment = 10;
		itemArray = new Object[stackSize];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(Object x) {
		top++;
		if(top == itemArray.length) {
			stackFull();
		}
		itemArray[top] = x;
	}
	
	public void stackFull() {
		Object[] temp = itemArray;
		itemArray = new Object[itemArray.length + increment];
		for(int i = 0; i<temp.length; i++) {
			itemArray[i] = temp[i];
		}
	}
	
	public Object pop() {
		if(top < 0) {
			return null;
		}
		Object item = itemArray[top];
		top--;
		return item;
	}
	
	public void remove() {
		if(top < 0) {
			return;
		}
		top--;
	}
	
	public Object peek() {
		if(top < 0) {
			return null;
		}
		return itemArray[top];
	}

}
