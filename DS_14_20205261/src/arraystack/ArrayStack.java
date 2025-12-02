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
		if(top >= stackSize - 1) {
			stackFull();
		}
		top++;
		itemArray[top] = x;
	}
	
	public void stackFull() {
		Object[] tempArr = itemArray;
		stackSize += increment;
		itemArray = new Object[stackSize];
		for(int i = 0; i<tempArr.length; i++) {
			itemArray[i] = tempArr[i];
		}
	}
	
	public Object pop() {
		Object item;
		if(top < 0) {
			return null;
		}
		else {
			item = itemArray[top];
			top--;
			return item;
		}
	}
	
	public void remove() {
		if(top < 0) {
			return;
		}
		else {
			top--;
		}
	}
	
	public Object peek() {
		if(top < 0) {
			return null;
		}
		else {
			return itemArray[top];
		}
	}

}
